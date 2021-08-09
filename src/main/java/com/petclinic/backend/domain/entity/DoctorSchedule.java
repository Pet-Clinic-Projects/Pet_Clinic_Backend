package com.petclinic.backend.domain.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "doctor_schedule_tb")
@Getter
public class DoctorSchedule {
    @EmbeddedId
    private DoctorScheduleId id;

    @JoinColumn(name = "pet_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pet pet;

    @JoinColumn(name = "reservation_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private DoctorReservation doctorReservation;

    @Column(name = "remark")
    private String remark;

}