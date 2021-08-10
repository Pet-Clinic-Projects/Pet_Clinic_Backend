package com.petclinic.backend.domain.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "DOCTOR_SCHEDULE_TB")
@Getter
public class DoctorSchedule {
    @EmbeddedId
    private DoctorScheduleId id;

    @JoinColumn(name = "PET_ID")
    @ManyToOne
    private Pet pet;

    @JoinColumn(name = "RESERVATION_ID")
    @ManyToOne
    private DoctorReservation doctorReservation;

    @Column(name = "REMARK")
    private String remark;

}