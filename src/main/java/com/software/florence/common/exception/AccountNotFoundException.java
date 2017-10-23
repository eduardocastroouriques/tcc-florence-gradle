package com.software.florence.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class AccountNotFoundException extends ApiErrorException {
    public AccountNotFoundException(String idOrEmail) {
        super("Account [" + idOrEmail + "] not found.");
    }
}
