package com.petclinic.backend.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
@NoArgsConstructor
@Table(name = "USER_GROUP_REL")
@Getter @Setter

public class UserPetRel {

    @EmbeddedId
    private UserPetRelID userPetRelID;

    private String DESCRIPTION;




}
