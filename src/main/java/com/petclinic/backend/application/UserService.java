package com.petclinic.backend.application;

import com.petclinic.backend.application.dto.UserCreateRequestDto;
import com.petclinic.backend.application.dto.UserDetailDto;
import com.petclinic.backend.domain.entity.User;
import com.petclinic.backend.domain.repository.UserRepository;
import com.petclinic.backend.domain.exceptions.BadRequestException;
import com.petclinic.backend.domain.exceptions.ErrorCode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public UserDetailDto signUp(UserCreateRequestDto user) {
        return UserDetailDto.from(this.userRepository.save(User.of(
                user.getWebId(),
                user.getName(),
                user.getPassword(),
                user.getPhone(),
                user.getTelephone(),
                user.getAddress(),
                user.getEmail(),
                user.getDescription(),
                null
        )));
    }

    @Transactional(readOnly = true)
    public UserDetailDto findById(String id) {
        return UserDetailDto.from(this.userRepository.findById(id).orElseThrow(
                () -> new BadRequestException(
                        ErrorCode.ROW_DOES_NOT_EXIST,
                        "Invalid user id"
                )
        ));
    }
}
