package com.petclinic.backend.domain.exceptions;

import lombok.Getter;

@Getter
public enum ErrorCode {
    ROW_DOES_NOT_EXIST(4000),

    INTERNAL_SERVER(5000);

    private int code;

    ErrorCode(int code) {
        this.code = code;
    }
}
