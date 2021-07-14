package com.petclinic.backend.domain.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "code_tb")
@Getter
public class Code {
    @Column(name = "id")
    @Id
    private String id;

    @JoinColumn(name = "group_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private CodeGroup group;

    @Column(name = "code_name", length = 65000)
    private String name;

    @Column(name = "description", length = 65000)
    private String description;

}
