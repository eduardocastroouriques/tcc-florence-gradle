package com.software.florence.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class ApiErrorException extends RuntimeException {
    public ApiErrorException() {
        super();
    }

    public ApiErrorException(String message) {
        super(message);
    }
}
