package com.candu.automatic_attendance.Repository;

import com.candu.automatic_attendance.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    public List<Student> findAllByStudentClassId(Long classId);

    Optional<Student> findStudentByRfidCardId(String rfid);

}
