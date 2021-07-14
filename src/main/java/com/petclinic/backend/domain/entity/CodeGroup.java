package com.petclinic.backend.domain.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "code_group_tb")
@Getter
public class CodeGroup {
    @Id
    @Column(name = "id", length = 60)
    private String id;

    @Column(name = "group_name", length = 65000)
    private String name;

    @Column(name = "description", length = 65000)
    private String description;
}
