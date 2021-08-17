package com.petclinic.backend.domain.entity;

import javax.persistence.*;

@Embeddable
public class HospitalHistoryId {
    @Column(name = "version")
    private Long version;

    @Column(name = "id")
    private String hospital;
}
