package com.petclinic.backend.domain.entity;

import javax.persistence.*;

@Embeddable
public class HospitalHisId {
    @Column(name = "version")
    private Long version;

    @JoinColumn(name = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Hospital hospital;
}
