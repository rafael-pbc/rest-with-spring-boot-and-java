package br.com.cunha.rafael.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathOperationExeception extends RuntimeException {
    public UnsupportedMathOperationExeception(String message) {
        super(message);
    }
}
