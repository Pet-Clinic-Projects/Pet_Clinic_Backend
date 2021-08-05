package com.petclinic.backend.domain.entity;

import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "employee_tb")
@Getter
public class Employee {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String id;

    @Column(name = "NAME", length = 1000)
    @NotNull
    private String name;

    @JoinColumn(name = "HOSPITAL_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Hospital hospital;

    @JoinColumn(name = "TYPE_CD")
    @ManyToOne(fetch = FetchType.LAZY)
    @NotNull
    private Code type;

    @Column(name = "WEB_ID", length = 1000)
    private String web;

    @Column(name = "PASSWORD", length = 1000)
    private String password;

    @Column(name = "PHONE", length = 1000)
    private String phone;

    @Column(name = "EMAIL", length = 1000)
    private String email;

    @Column(name = "START_TS")
    private LocalDateTime start;

    @Column(name = "END_TS")
    private LocalDateTime end;
}
