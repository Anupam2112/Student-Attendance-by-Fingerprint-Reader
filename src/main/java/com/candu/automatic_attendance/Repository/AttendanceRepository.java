package com.candu.automatic_attendance.Repository;

import com.candu.automatic_attendance.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

}
