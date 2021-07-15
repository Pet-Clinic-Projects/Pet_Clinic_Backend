package com.petclinic.backend.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "USER_TB")
public class User extends BaseEntity {
    @Column(name = "web_id")
    private String webId;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "phone")
    private String phone;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "description")
    private String description;

    @Column(name = "delete_ts")
    private LocalDateTime deleteTs;

    // TODO: Add Foreign key

    private User(
            String webId,
            String name,
            String password,
            String phone,
            String telephone,
            String address,
            String email,
            String description,
            LocalDateTime deleteTs
    ) {
        this.webId = webId;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.telephone = telephone;
        this.address = address;
        this.email = email;
        this.description = description;
        this.deleteTs = deleteTs;
    }

    public static User of(
            String webId,
            String name,
            String password,
            String phone,
            String telephone,
            String address,
            String email,
            String description,
            LocalDateTime deleteTs
    ) {
        return new User(
                webId,
                name,
                password,
                phone,
                telephone,
                address,
                email,
                description,
                deleteTs
        );
    }
}
