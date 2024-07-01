package com.payroll;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Handle HTTP 404 error
 * RestControllerAdvice signals that this advice is rendered straight into the response body
 * ExceptionHandler configures the advice to only respond when an EmployeeNotFoundException is thrown
 * */
@RestControllerAdvice
class EmployeeNotFoundAdvice {

    @ExceptionHandler(EmployeeNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(EmployeeNotFoundException exception) {
        return exception.getMessage();
    }
}
