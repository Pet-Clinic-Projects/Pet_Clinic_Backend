package com.petclinic.backend.domain.entity;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Embeddable
@Getter
public class DoctorScheduleId {
    @Column(name = "schedule_ts")
    private LocalDateTime scheduleTS;

    @JoinColumn(name = "doctor_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Doctor doctor;

    public DoctorScheduleId(LocalDateTime scheduleTS, Doctor doctor){
        this.scheduleTS = scheduleTS;
        this.doctor = doctor;
    }
}
