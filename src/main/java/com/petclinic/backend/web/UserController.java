package com.petclinic.backend.web;

import com.petclinic.backend.application.UserService;
import com.petclinic.backend.application.dto.UserCreateRequestDto;
import com.petclinic.backend.application.dto.UserDetailDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v0.1/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public UserDetailDto findById(@PathVariable String id) {
        return userService.findById(id);
    }

    @PostMapping(value = "/signUp")
    @ResponseStatus(value = HttpStatus.CREATED)
    public UserDetailDto signUp(@RequestBody UserCreateRequestDto userCreateDto) {
        return userService.signUp(userCreateDto);
    }
}
