package com.petclinic.backend.domain.entity;

import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
@Getter
public class EmployeeHisId implements Serializable {
    @Column(name = "version")
    private Long version;

    @JoinColumn(name = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    public EmployeeHisId(Long version, Employee employee) {
        this.version = version;
        this.employee = employee;
    }
}
