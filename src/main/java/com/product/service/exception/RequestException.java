package com.product.service.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;
@Data
public class RequestException extends  RuntimeException{
    private int code;
    private HttpStatus status;

    public RequestException(String message, int code, HttpStatus status) {
        super(message);
        this.status=status;
        this.code = code;
    }
}
