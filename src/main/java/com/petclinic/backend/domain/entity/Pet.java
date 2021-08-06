package com.petclinic.backend.domain.entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@NoArgsConstructor
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

    private String STATE_CD;

    private String WEIGHT;

    private String HEIGHT;

    private String COLOR;

    private String AGE;

    @OneToMany(mappedBy = "pet",cascade = CascadeType.ALL)
    private UserPetRel userPetRel;
}
