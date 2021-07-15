package com.petclinic.backend.domain.exceptions;

public class InternalServerException extends BaseRuntimeExeption {
    public InternalServerException(ErrorCode errorCode, String message) {
        super(errorCode, message);
    }
}
