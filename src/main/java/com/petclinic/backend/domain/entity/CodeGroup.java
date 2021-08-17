package com.petclinic.backend.domain.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "CODE_GROUP_TB")
@Getter
public class CodeGroup {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "group_name", length = 1000)
    private String name;

    @Column(name = "description", length = 1000)
    private String description;
}
