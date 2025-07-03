package com.candu.automatic_attendance.Service;


import com.candu.automatic_attendance.Repository.AttendanceRepository;
import com.candu.automatic_attendance.entity.Attendance;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AttendanceService {

    private final AttendanceRepository attendanceRepository;

    public Attendance add (Attendance attendance){
        return attendanceRepository.save(attendance);
    }


}
