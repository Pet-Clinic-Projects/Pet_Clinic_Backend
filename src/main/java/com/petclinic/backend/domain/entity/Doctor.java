package com.petclinic.backend.domain.entity;

import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "doctor_tb")
@Getter
public class Doctor {
    @Id
    @Column(name = "ID", length = 100)
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String id;

    @Column(name = "NAME", length = 1000)
    @NotNull
    private String name;

    @JoinColumn(name = "HOSPITAL_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Hospital hospital;

    @Column(name = "WEB_ID", length = 1000)
    private String web;

    @Column(name = "PASSWORD", length = 1000)
    private String password;

    @Column(name = "PHONE", length = 1000)
    private String phone;

    @Column(name = "EMAIL", length = 1000)
    private String email;

    @Column(name = "LICENSE", length = 1000)
    @Lob
    private String license;

    @Column(name = "INFO", length = 1000)
    private String info;

    @Column(name = "POSITION", length = 1000)
    private String position;

    @Column(name = "START_TS")
    private LocalDateTime start;

    @Column(name = "END_TS")
    private LocalDateTime end;

}
