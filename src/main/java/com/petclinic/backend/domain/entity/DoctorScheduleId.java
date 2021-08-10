package com.petclinic.backend.domain.entity;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Embeddable
@Getter
public class DoctorScheduleId {
    @Column(name = "SCHEDULE_TS")
    private LocalDateTime scheduleTS;

    @JoinColumn(name = "DOCTOR_ID")
    @ManyToOne
    private Doctor doctor;

    public DoctorScheduleId(LocalDateTime scheduleTS, Doctor doctor){
        this.scheduleTS = scheduleTS;
        this.doctor = doctor;
    }
}
