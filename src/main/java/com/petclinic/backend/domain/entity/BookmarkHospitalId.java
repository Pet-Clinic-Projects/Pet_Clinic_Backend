package com.petclinic.backend.domain.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class BookmarkHospitalId implements Serializable {
    @JoinColumn(name = "user_id")
    @ManyToOne
    private User user;

    @JoinColumn(name = "hospital_id")
    private Hospital hospital;

}
