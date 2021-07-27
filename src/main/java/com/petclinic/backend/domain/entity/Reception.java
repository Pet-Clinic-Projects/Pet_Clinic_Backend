package com.petclinic.backend.domain.entity;

import lombok.Getter;
import org.aspectj.apache.bcel.classfile.Code;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reception_tb")
@Getter
public class Reception {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private String id;

    @JoinColumn(name = "reservation_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Reservation reservation;

    @Column(name = "reception_ts")
    private LocalDateTime receptionTS;

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

    @JoinColumn(name = "infra_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Infra infra;

}
