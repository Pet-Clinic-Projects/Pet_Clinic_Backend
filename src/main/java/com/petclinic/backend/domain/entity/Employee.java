package com.petclinic.backend.domain.entity;

import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "EMPLOYEE_TB")
@Getter
public class Employee {
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

    @JoinColumn(name = "type_cd")
    @ManyToOne
    private Code type;

    @Column(name = "web_id", length = 1000)
    private String web;

    @Column(name = "password", length = 1000)
    private String password;

    @Column(name = "phone", length = 1000)
    private String phone;

    @Column(name = "email", length = 1000)
    private String email;

    @Column(name = "start_ts")
    private LocalDateTime start;

    @Column(name = "end_ts")
    private LocalDateTime end;
}
