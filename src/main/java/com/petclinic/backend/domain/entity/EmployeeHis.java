package com.petclinic.backend.domain.entity;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "employee_his_tb")
@Getter
public class EmployeeHis {
    @EmbeddedId
    private EmployeeHisId id;

    @Column(name = "name", length = 65000)
    @NotNull
    private String name;

    @JoinColumn(name = "hospital_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Hospital hospital;

    @JoinColumn(name = "type_cd")
    @ManyToOne(fetch = FetchType.LAZY)
    private Code type;

    @Column(name = "password", length = 65000)
    private String password;

    @Column(name = "phone", length = 65000)
    private String phone;

    @Column(name = "email", length = 65000)
    private String email;
}
