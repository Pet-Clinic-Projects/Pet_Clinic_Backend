package com.petclinic.backend.domain.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "code_group_tb")
@Getter
public class CodeGroup {
    @Id
    @Column(name = "ID", length = 100)
    private String id;

    @Column(name = "GROUP_NAME", length = 1000)
    @NotNull
    private String name;

    @Column(name = "DESCRIPTION", length = 1000)
    private String description;
}
