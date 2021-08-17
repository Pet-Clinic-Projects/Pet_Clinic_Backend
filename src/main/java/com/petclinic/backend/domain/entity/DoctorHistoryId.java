package com.petclinic.backend.domain.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Embeddable
public class DoctorHistoryId implements Serializable {
    @Column(name = "version")
    private Long version;

    @Column(name = "id")
    private String id;
}
