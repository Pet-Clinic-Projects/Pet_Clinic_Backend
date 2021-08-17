package com.petclinic.backend.domain.entity;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class OfficeHourId implements Serializable {
    @Column(name = "day")
    private String day;

    @JoinColumn(name = "hospital_id")
    @ManyToOne
    private Hospital hospital;
}
