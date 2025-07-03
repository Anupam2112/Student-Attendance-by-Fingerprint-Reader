package com.candu.automatic_attendance.Controller;

import com.candu.automatic_attendance.Dto.AttendanceRequest;
import com.candu.automatic_attendance.Service.AttendanceService;
import com.candu.automatic_attendance.Service.StudentClassService;
import com.candu.automatic_attendance.Service.StudentService;
import com.candu.automatic_attendance.entity.Attendance;
import com.candu.automatic_attendance.entity.Student;
import com.candu.automatic_attendance.entity.StudentClass;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;



@RestController
@RequestMapping("/attendance")
@RequiredArgsConstructor
public class AttendanceRequestController {

    private final AttendanceService attendanceService;
    private final StudentService studentService;
    private final StudentClassService studentClassService;


    @PostMapping
    public ResponseEntity<HttpStatus> markAttendance(@RequestBody AttendanceRequest request) {
        System.out.println(request.getRfid());
        System.out.println(request.getClassId());

        Attendance attendance = Attendance.builder()
                .status("present")
                .student(request.getRfid())
                .studentClass(request.getClassId().toString())
                .build();

        attendanceService.add(attendance);

        return new ResponseEntity<>(HttpStatus.OK);
    }


    @GetMapping()
    public List<String> getStudentRFID(@RequestParam("class") String className){

        List<Student> students = studentService.getStudentRFIDByClassName(className);

        List<String> rfIds = new ArrayList<>();
        for (Student student: students) {
            rfIds.add(student.getRfidCardId());
        }

        return rfIds;
    }
}
