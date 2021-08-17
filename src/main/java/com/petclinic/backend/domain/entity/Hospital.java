package com.petclinic.backend.domain.entity;

import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "HOSPITAL_TB")
@Getter
public class Hospital {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String id;

    @Column(name = "name", length = 1000)
    private String name;

    @JoinColumn(name = "state_cd")
    @ManyToOne(fetch = FetchType.LAZY)
    private Code state;

    @Column(name = "phone", length = 1000)
    private String phone;

    @Column(name = "address", length = 1000)
    private String address;

    @Column(name = "fax", length = 1000)
    private String fax;

    @Column(name = "description", length = 1000)
    private String description;

    @Column(name = "start_ts")
    private LocalDateTime start;

}
