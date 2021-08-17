package com.petclinic.backend.domain.entity;

import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "DOCTOR_TB")
@Getter
public class Doctor {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String id;

    @Column(name = "name", length = 1000)
    private String name;

    @JoinColumn(name = "hospital_id")
    @ManyToOne
    private Hospital hospital;

    @Column(name = "web_id", length = 1000)
    private String web;

    @Column(name = "password", length = 1000)
    private String password;

    @Column(name = "phone", length = 1000)
    private String phone;

    @Column(name = "email", length = 1000)
    private String email;

    @Column(name = "license", length = 1000)
    @Lob
    private String license;

    @Column(name = "info", length = 1000)
    private String info;

    @Column(name = "position", length = 1000)
    private String position;

    @Column(name = "start_ts")
    private LocalDateTime start;

    @Column(name = "end_ts")
    private LocalDateTime end;

}
