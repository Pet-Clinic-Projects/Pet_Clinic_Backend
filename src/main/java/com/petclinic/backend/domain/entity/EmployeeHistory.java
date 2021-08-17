package com.petclinic.backend.domain.entity;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "EMPLOYEE_HISTORY_TB")
@Getter
public class EmployeeHistory {
    @EmbeddedId
    private EmployeeHistoryId id;

    @Column(name = "name", length = 1000)
    private String name;

    @Column(name = "hospital_id", length = 100)
    private String hospital;

    @Column(name = "type_cd", length = 100)
    private String type;

    @Column(name = "password", length = 1000)
    private String password;

    @Column(name = "phone", length = 1000)
    private String phone;

    @Column(name = "email", length = 1000)
    private String email;

    @Column(name = "modify_ts")
    private LocalDateTime modify;
}
