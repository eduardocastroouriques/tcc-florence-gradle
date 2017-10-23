package com.software.florence.common.pattern.application.resource;

import com.software.florence.common.exception.ApiValidationErrorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;

public abstract class GenericController {

    private static Logger logger = LoggerFactory.getLogger(GenericController.class);

    protected void verifyValidation(BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            logger.debug("Validation error at REST Controller", bindingResult);
            throw new ApiValidationErrorException(bindingResult);
        }
    }
}
