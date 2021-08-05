package com.petclinic.backend.domain.entity;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "hospital_his_tb")
@Getter
public class HospitalHis {
    @EmbeddedId
    private HospitalHisId id;

    @Column(name = "NAME", length = 1000)
    @NotNull
    private String name;

    @Column(name = "STATE_CD")
    @NotNull
    private String state;

    @Column(name = "PHONE", length = 1000)
    private String phone;

    @Column(name = "ADDRESS", length = 1000)
    private String address;

    @Column(name = "FAX", length = 1000)
    private String fax;

    @Column(name = "MODIFY_TS")
    @NotNull
    private LocalDateTime modify;
}
