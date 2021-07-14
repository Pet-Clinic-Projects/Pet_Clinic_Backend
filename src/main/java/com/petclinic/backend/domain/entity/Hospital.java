package com.petclinic.backend.domain.entity;

import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "hospital_tb")
@Getter
public class Hospital {
    @Id
    @Column(name = "id", length = 60)
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String id;

    @Column(name = "name", length = 65000)
    @NotNull
    private String name;

    @JoinColumn(name = "state_cd")
    @ManyToOne(fetch = FetchType.LAZY)
    @NotNull
    private Code state;

    @Column(name = "phone", length = 60)
    private String phone;

    @Column(name = "address", length = 65000)
    private String address;

    @Column(name = "fax", length = 65000)
    private String fax;

}
