package com.petclinic.backend.domain.entity;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "DOCTOR_HISTORY_TB")
@Getter
public class DoctorHistory {
    @EmbeddedId
    private DoctorHistoryId id;

    @Column(name = "hospital_id")
    private String hospital;

    @Column(name = "name", length = 1000)
    private String name;

    @Column(name = "password", length = 1000)
    private String password;

    @Column(name = "phone", length = 1000)
    private String phone;

    @Column(name = "email", length = 1000)
    private String email;

    @Column(name = "modify_ts")
    private LocalDateTime modify;

    @Column(name = "position", length = 1000)
    private String position;
}
