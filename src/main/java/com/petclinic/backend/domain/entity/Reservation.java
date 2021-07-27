package com.petclinic.backend.domain.entity;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reservation_tb")
@Getter
public class Reservation {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private String id;

    @Column(name = "reservation_ts")
    private LocalDateTime reservationTS;

    @JoinColumn(name = "state_cd")
    @ManyToOne(fetch = FetchType.LAZY)
    private Code state;

    @JoinColumn(name = "category_cd")
    @ManyToOne(fetch = FetchType.LAZY)
    private Code category;

    @JoinColumn(name = "usergroup_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Usergroup usergroup;

    @JoinColumn(name = "pet_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pet pet;

    @JoinColumn(name = "hospital_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Hospital hospital;

    @JoinColumn(name = "doctor_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Doctor doctor;

    @Column(name = "remark")
    private String remark;

}
