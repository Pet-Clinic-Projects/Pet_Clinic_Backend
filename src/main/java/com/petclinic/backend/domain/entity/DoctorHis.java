package com.petclinic.backend.domain.entity;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "doctor_his_tb")
@Getter
public class DoctorHis {
    @EmbeddedId
    private DoctorHisId id;

    @Column(name = "HOSPITAL_ID")
    private String hospital;

    @Column(name = "NAME", length = 1000)
    private String name;

    @Column(name = "PASSWORD", length = 1000)
    private String password;

    @Column(name = "PHONE", length = 1000)
    private String phone;

    @Column(name = "EMAIL", length = 1000)
    private String email;

    @Column(name = "MODIFY_TS")
    private LocalDateTime modify;

    @Column(name = "POSITION", length = 1000)
    private String position;
}
