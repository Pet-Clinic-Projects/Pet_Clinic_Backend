package com.petclinic.backend.domain.entity;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "code_tb")
@Getter
public class Code {
    @Column(name = "ID", length = 100)
    @Id
    private String id;

    @JoinColumn(name = "GROUP_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    @NotNull
    private CodeGroup group;

    @Column(name = "CODE_NAME", length = 1000)
    @NotNull
    private String name;

    @Column(name = "DESCRIPTION", length = 1000)
    private String description;

}
