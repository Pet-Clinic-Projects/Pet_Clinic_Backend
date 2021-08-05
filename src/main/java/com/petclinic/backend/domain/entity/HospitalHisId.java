package com.petclinic.backend.domain.entity;

import javax.persistence.*;

@Embeddable
public class HospitalHisId {
    @Column(name = "VERSION")
    private Long version;

    @Column(name = "ID", length = 100)
    private String hospital;
}
