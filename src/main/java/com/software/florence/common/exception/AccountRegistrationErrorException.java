package com.software.florence.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class AccountRegistrationErrorException extends ApiErrorException {
    public AccountRegistrationErrorException(String message) {
        super(message);
    }
}
