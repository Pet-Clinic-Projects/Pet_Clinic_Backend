package com.petclinic.backend.domain.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BOOKMARK_HOSPITAL_TB")
public class BookmarkHospital {
    @EmbeddedId
    private BookmarkHospitalId id;
}
