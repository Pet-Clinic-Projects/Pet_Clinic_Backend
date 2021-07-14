package com.petclinic.backend.domain.entity;

import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "employee_tb")
@Getter
public class Employee {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String id;

    @Column(name = "name", length = 65000)
    @NotNull
    private String name;

    @JoinColumn(name = "hospital_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Hospital hospital;

    @JoinColumn(name = "type_cd")
    @ManyToOne(fetch = FetchType.LAZY)
    private Code type;

    @Column(name = "web_id", length = 65000)
    private String web;

    @Column(name = "password", length = 65000)
    private String password;

    @Column(name = "phone", length = 65000)
    private String phone;

    @Column(name = "email", length = 65000)
    private String email;
}
