package com.petclinic.backend.domain.entity;

import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "hospital_tb")
@Getter
public class Hospital {
    @Id
    @Column(name = "ID", length = 100)
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String id;

    @Column(name = "NAME", length = 1000)
    @NotNull
    private String name;

    @JoinColumn(name = "STATE_CD")
    @ManyToOne(fetch = FetchType.LAZY)
    @NotNull
    private Code state;

    @Column(name = "PHONE", length = 1000)
    private String phone;

    @Column(name = "ADDRESS", length = 1000)
    private String address;

    @Column(name = "FAX", length = 1000)
    private String fax;

    @Column(name = "DESCRIPTION", length = 1000)
    private String description;

    @Column(name = "START_TS")
    @NotNull
    private LocalDateTime start;

}
