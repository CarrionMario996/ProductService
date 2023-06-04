package com.product.service.controller;

import com.product.service.exception.RequestException;
import com.product.service.model.dto.ErrorDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class ControllerAdvice{

    @ExceptionHandler(value= RequestException.class)
    public ResponseEntity<ErrorDto> runtimeExceptionHandler(RequestException ex){
        ErrorDto error=ErrorDto.builder().code(ex.getCode()).message(ex.getMessage()).build();
        return new ResponseEntity<>(error, ex.getStatus());
    }
}
