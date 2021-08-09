package com.petclinic.backend.domain.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "infra_tb")
@Getter
public class Infra {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private String id;

    @JoinColumn(name = "hospital_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Hospital hospital;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "max_weight")
    private int maxWeight;

}