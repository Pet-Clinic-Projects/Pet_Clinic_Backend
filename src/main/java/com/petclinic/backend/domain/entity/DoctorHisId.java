package com.petclinic.backend.domain.entity;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class DoctorHisId implements Serializable {
    @Column(name = "version")
    private Long version;

    @JoinColumn(name = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Doctor doctor;
}
