package com.petclinic.backend.domain.entity;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "hospital_his_tb")
@Getter
public class HospitalHis {
    @EmbeddedId
    private HospitalHisId id;

    @Column(name = "name", length = 65000)
    @NotNull
    private String name;

    @JoinColumn(name = "state_cd")
    @ManyToOne(fetch = FetchType.LAZY)
    @NotNull
    private Code state;

    @Column(name = "phone", length = 65000)
    private String phone;

    @Column(name = "address", length = 65000)
    private String address;

    @Column(name = "fax", length = 65000)
    private String fax;
}
