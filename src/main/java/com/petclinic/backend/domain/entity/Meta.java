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
    @Column(name = "ID", length = 100)
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uudi2", strategy = "uuid2")
    private String id;

    @Column(name = "NAME", length = 1000)
    @NotNull
    private String name;

    @Column(name = "DESCRIPTION", length = 1000)
    private String description;

    @JoinColumn(name = "PARENT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Meta parent;
}
