package com.candu.automatic_attendance.Repository;

import com.candu.automatic_attendance.entity.StudentClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentClassRepository extends JpaRepository<StudentClass, Long> {

    public Optional<StudentClass> findByName(String name);
}
