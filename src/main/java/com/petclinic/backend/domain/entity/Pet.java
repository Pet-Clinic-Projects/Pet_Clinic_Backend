package com.petclinic.backend.domain.entity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="PET_TB")
@Getter @Setter
public class Pet {

    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(generator = "uuid2")
    @Column (name="PET_ID")
    private String id;

    private String NAME;

    private String SPECIES_CD;  //join 해야하나?

    private String SPECIES_NAME;

    private String STATE_CD;

    private String WEIGHT;

    private String HEIGHT;

    private String COLOR;

    private String AGE;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USERGROUP_ID")
    private UserGroup usergroup;
}
