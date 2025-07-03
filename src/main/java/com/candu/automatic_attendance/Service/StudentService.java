package com.candu.automatic_attendance.Service;


import com.candu.automatic_attendance.Repository.StudentClassRepository;
import com.candu.automatic_attendance.Repository.StudentRepository;
import com.candu.automatic_attendance.entity.Student;
import com.candu.automatic_attendance.entity.StudentClass;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    private final StudentClassRepository classRepository;

    public Student save (Student student) {
        return studentRepository.save(student);
    }

    public void delete(Student student){
        studentRepository.delete(student);
    }

    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    public List<Student> findByClass(StudentClass studentClass){
        return studentRepository.findAllByStudentClassId(studentClass.getId());
    }

    public List<Student> getStudentRFIDByClassName(String className){
        Optional<StudentClass> studentClass = classRepository.findByName(className);
        return studentClass.map(aClass -> studentRepository.findAllByStudentClassId(aClass.getId())).orElse(null);
    }

    public Student findByRfId(String rfid){
        return studentRepository.findStudentByRfidCardId(rfid).orElseThrow();
    }
}
