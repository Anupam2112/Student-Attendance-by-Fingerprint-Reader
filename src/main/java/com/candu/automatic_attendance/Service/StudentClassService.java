package com.candu.automatic_attendance.Service;

import com.candu.automatic_attendance.Repository.StudentClassRepository;
import com.candu.automatic_attendance.entity.Student;
import com.candu.automatic_attendance.entity.StudentClass;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentClassService {

    private final StudentClassRepository studentClassRepository;

    public StudentClass save(StudentClass studentClass) {
        return studentClassRepository.save(studentClass);
    }

    public StudentClass addStudent(StudentClass studentClass, Student student) {
        studentClass.getStudents().add(student);
        return studentClassRepository.save(studentClass);
    }

    public void delete(StudentClass studentClass) {
        studentClassRepository.delete(studentClass);
    }

    public List<StudentClass> findAll() {
        return studentClassRepository.findAll();
    }

    public StudentClass findByName(Long name) {
        return studentClassRepository.findById(name).orElseThrow(); //TODO Custom exception
    }

}