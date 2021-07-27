package com.petclinic.backend.domain.entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="USER_TB")
@Getter @Setter
public class User {
    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(generator = "uuid2")
    @Column (name="USER_ID")
    private String id;

    private String WEB_ID;

    private String NAME;

    private String PASSWORD;

    private String PHONE;

    private String TELEPHONE;

    private String ADDRESS;

    private String EMAIL;

    private String DESCRIPTION;

    private LocalDateTime START_TS;

    private LocalDateTime END_TS;

    @OneToMany (mappedBy = "user" ,cascade = CascadeType.ALL)
    private List<UserGroupRel> usergrouprel= new ArrayList<>();
}
