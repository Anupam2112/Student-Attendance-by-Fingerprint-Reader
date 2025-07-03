package com.candu.automatic_attendance.Dto;

import lombok.Data;

@Data
public class AttendanceRequest {
    private String rfid;
    private Long classId;
}