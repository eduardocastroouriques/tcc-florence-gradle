package com.software.florence.common.exception;

import org.springframework.validation.Errors;

public class ApiValidationErrorException extends ApiErrorException {
    private Errors errors;

    public ApiValidationErrorException(Errors errors) {
        super();
        this.errors = errors;
    }

    public Errors getErrors() {
        return this.errors;
    }
}
