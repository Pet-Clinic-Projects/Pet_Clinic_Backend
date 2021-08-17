package com.petclinic.backend.application.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserCreateRequestDto {
    private String webId;
    private String name;
    private String password;
    private String phone;
    private String telephone;
    private String address;
    private String email;
    private String description;
}
