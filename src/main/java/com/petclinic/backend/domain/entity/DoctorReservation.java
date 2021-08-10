package com.petclinic.backend.domain.entity;

import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "DOCTOR_RESERVATION_TB")
@Getter
public class DoctorReservation {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String id;

    @Column(name = "RESERVATION_TS")
    private LocalDateTime reservationTS;

    @JoinColumn(name = "STATE_CD")
    @ManyToOne
    private Code state;

    @JoinColumn(name = "CATEGORY_CD")
    @ManyToOne
    private Code category;

    @JoinColumn(name = "PET_ID")
    @ManyToOne
    private Pet pet;

    @JoinColumn(name = "HOSPITAL_ID")
    @ManyToOne
    private Hospital hospital;

    @JoinColumn(name = "DOCTOR_ID")
    @ManyToOne
    private Doctor doctor;

    @Column(name = "REMARK")
    private String remark;

}