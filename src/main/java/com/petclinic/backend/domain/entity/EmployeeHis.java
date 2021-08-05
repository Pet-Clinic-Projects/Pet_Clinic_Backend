package com.petclinic.backend.domain.entity;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "employee_his_tb")
@Getter
public class EmployeeHis {
    @EmbeddedId
    private EmployeeHisId id;

    @Column(name = "name", length = 1000)
    private String name;

    @Column(name = "HOSPITAL_ID", length = 100)
    private String hospital;

    @Column(name = "TYPE_CD", length = 100)
    @NotNull
    private String type;

    @Column(name = "PASSWORD", length = 1000)
    private String password;

    @Column(name = "PHONE", length = 1000)
    private String phone;

    @Column(name = "EMAIL", length = 1000)
    private String email;

    @Column(name = "MODIFY_TS")
    private LocalDateTime modify;
}
