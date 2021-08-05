package com.petclinic.backend.domain.entity;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class OfficeHourId implements Serializable {
    @Column(name = "DAY")
    private String day;

    @JoinColumn(name = "HOSPITAL_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Hospital hospital;
}
