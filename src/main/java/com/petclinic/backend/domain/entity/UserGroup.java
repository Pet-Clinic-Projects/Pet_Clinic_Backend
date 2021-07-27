package com.petclinic.backend.domain.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "USERGROUP_TB")
@Getter @Setter
public class UserGroup {

    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(generator = "uuid2")
    @Column (name="USERGROUP_ID")
    private String id;

    private String NAME;

    private String DESCRIPTION;

    @OneToMany (mappedBy = "usergroup" , cascade = CascadeType.ALL)
    private List<UserGroupRel> usergrouprel = new ArrayList<>();
}
