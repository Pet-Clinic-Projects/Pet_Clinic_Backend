package com.petclinic.backend.domain.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Embeddable
public class DoctorHisId implements Serializable {
    @Column(name = "VERSION")
    @NotNull
    private Long version;

    @Column(name = "ID", length = 100)
    @NotNull
    private String id;
}
