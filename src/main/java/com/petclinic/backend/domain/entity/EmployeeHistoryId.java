package com.petclinic.backend.domain.entity;

import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
@Getter
public class EmployeeHistoryId implements Serializable {
    @Column(name = "version")
    private Long version;

    @Column(name = "id")
    private String employee;

    public EmployeeHistoryId(Long version, String employee) {
        this.version = version;
        this.employee = employee;
    }
}
