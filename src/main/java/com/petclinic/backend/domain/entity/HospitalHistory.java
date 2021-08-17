package com.petclinic.backend.domain.entity;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "HOSPITAL_HISTORY_TB")
@Getter
public class HospitalHistory {
    @EmbeddedId
    private HospitalHistoryId id;

    @Column(name = "name", length = 1000)
    private String name;

    @Column(name = "state_cd")
    private String state;

    @Column(name = "phone", length = 1000)
    private String phone;

    @Column(name = "address", length = 1000)
    private String address;

    @Column(name = "fax", length = 1000)
    private String fax;

    @Column(name = "modify_ts")
    private LocalDateTime modify;
}
