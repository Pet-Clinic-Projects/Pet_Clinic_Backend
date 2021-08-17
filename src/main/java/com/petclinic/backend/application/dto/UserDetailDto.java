package com.petclinic.backend.application.dto;

import com.petclinic.backend.domain.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDetailDto {
    private String webId;
    private String name;
    private String phone;
    private String telephone;
    private String address;
    private String email;
    private String description;
    private LocalDateTime deleteTs;
    
    public static UserDetailDto from(User user) {
        return new UserDetailDto(
                user.getWebId(),
                user.getName(),
                user.getPhone(),
                user.getTelephone(),
                user.getAddress(),
                user.getEmail(),
                user.getDescription(),
                user.getDeleteTs()
        );
    }
}
