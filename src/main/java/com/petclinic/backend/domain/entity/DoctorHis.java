package com.petclinic.backend.domain.entity;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "doctor_his_tb")
@Getter
public class DoctorHis {
    @EmbeddedId
    private DoctorHisId id;

    @JoinColumn(name = "hospital_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Hospital hospital;

    @Column(name = "name", length = 65000)
    @NotNull
    private String name;

    @Column(name = "password", length = 65000)
    private String password;

    @Column(name = "modify_ts")
    private LocalDateTime modify;

    @Column(name = "phone", length = 65000)
    private String phone;

    @Column(name = "email", length = 65000)
    private String email;

}
