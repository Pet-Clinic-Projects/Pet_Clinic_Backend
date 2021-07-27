package com.petclinic.backend.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import static javax.persistence.FetchType.LAZY;

@Entity
@Table(name = "USER_GROUP_REL")
@Getter @Setter

public class UserGroupRel {

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "GROUP_ID")  //usergroup ID 네임이랑 같아야하나?
    private UserGroup usergroup;




}
