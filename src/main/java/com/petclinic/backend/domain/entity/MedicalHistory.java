package com.petclinic.backend.domain.entity;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "medical_history_tb")
@Getter
public class MedicalHistory {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private String id;

    @JoinColumn(name = "usergroup_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private UserGroup usergroup;

    @JoinColumn(name = "doctor_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Doctor doctor;

    @JoinColumn(name = "pet_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pet pet;

    @JoinColumn(name = "hospital_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Hospital hospital;

    @Column(name = "history_ts")
    private LocalDateTime historyTS;

    @JoinColumn(name = "type_cd")
    @ManyToOne(fetch = FetchType.LAZY)
    private Type type;

    @JoinColumn(name = "code_cd")
    @ManyToOne(fetch = FetchType.LAZY)
    private Code code;

    @Column(name = "description")
    private String description;

    @Column(name = "qty")
    private String qty;

    @Column(name = "amount")
    private String amount;

    @Column(name = "by")
    private String by;

    @Column(name = "photo")
    private String photo;

    @Column(name = "xls")
    private String xls;

    @Column(name = "variance")
    private String variance;

    @Column(name = "journal")
    private String journal;

    @Column(name = "zip")
    private String zip;

}
