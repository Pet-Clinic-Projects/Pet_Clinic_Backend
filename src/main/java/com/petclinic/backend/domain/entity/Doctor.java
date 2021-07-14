package com.petclinic.backend.domain.entity;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "doctor_tb")
@Getter
public class Doctor {
    @Id
    @Column(name = "id")
    private String id;

    @JoinColumn(name = "hospital_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Hospital hospital;

    @Column(name = "name", length = 65000)
    @NotNull
    private String name;

    @Column(name = "web_id", length = 65000)
    private String web;

    @Column(name = "password", length = 65000)
    private String password;

    @Column(name = "license", length = 65000)
    @Lob
    private String license;

    @Column(name = "start_ts")
    private LocalDateTime start;

    @Column(name = "end_ts")
    private LocalDateTime end;

    @Column(name = "phone", length = 65000)
    private String phone;

    @Column(name = "email", length = 65000)
    private String email;
}
