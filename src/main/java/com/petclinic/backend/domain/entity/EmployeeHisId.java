package com.petclinic.backend.domain.entity;

import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
@Getter
public class EmployeeHisId implements Serializable {
    @Column(name = "VERSION")
    private Long version;

    @Column(name = "ID", length = 100)
    private String employee;

    public EmployeeHisId(Long version, String employee) {
        this.version = version;
        this.employee = employee;
    }
}
