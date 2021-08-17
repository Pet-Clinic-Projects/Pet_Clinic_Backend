package com.petclinic.backend.domain.entity;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "CODE_TB")
@Getter
public class Code {
    @Column(name = "id")
    @Id
    private String id;

    @JoinColumn(name = "group_id")
    @ManyToOne
    private CodeGroup group;

    @Column(name = "code_name", length = 1000)
    private String name;

    @Column(name = "description", length = 1000)
    private String description;

}
