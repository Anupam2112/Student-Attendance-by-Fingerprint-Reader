package com.candu.automatic_attendance.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "attendance")
@Builder
@EntityListeners(AuditingEntityListener.class)
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "student")
    private String student;

    @Column(name ="student_class")
    private String studentClass;

    @CreationTimestamp
    @Column(name = "timestamp", nullable = false, updatable = false)
    private Timestamp timestamp;

    @Column(name = "status", nullable = false)
    private String status;
}
