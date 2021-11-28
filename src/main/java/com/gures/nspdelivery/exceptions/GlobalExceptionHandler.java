package com.gures.nspdelivery.exceptions;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DataIntegrityViolationException.class)
    @ResponseBody
    public Map<String, String> handleViolationException(DataIntegrityViolationException dataEx) {
        Map<String, String> errors = new HashMap<>();
        errors.put("message", dataEx.getMessage());
        return errors;
    }

}
