package com.petclinic.backend.domain.entity;

import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "META_TB")
@Getter
public class Meta {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uudi2", strategy = "uuid2")
    private String id;

    @Column(name = "name", length = 1000)
    private String name;

    @Column(name = "description", length = 1000)
    private String description;

    @JoinColumn(name = "parent_id")
    @ManyToOne
    private Meta parent;
}
