package com.petclinic.backend.domain.entity;

import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "meta_tb")
@Getter
public class Meta {
    @Id
    @Column(name = "id", length = 60)
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uudi2", strategy = "uuid2")
    private String id;

    @Column(name = "name", length = 65000)
    @NotNull
    private String name;

    @Column(name = "description", length = 65000)
    private String description;

    @JoinColumn(name = "parent_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Meta parent;
}
