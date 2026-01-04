package com.tcs.springboot_crud_with_mysql_database.exception;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProductExceptionHandler {

    // Validation Errors (@NotEmpty, @PastOrPresent etc)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> methodArgumentNotValidException(MethodArgumentNotValidException ex) {

        Map<String, String> map = new HashMap<>();
        List<FieldError> fieldErrors = ex.getFieldErrors();

        for (FieldError fieldError : fieldErrors) {
            String fieldName = fieldError.getField();
            String fieldMsg = fieldError.getDefaultMessage();
            map.put(fieldName, fieldMsg);
        }

        return ResponseEntity.badRequest().body(map);
    }

    // Runtime errors (future ready)
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<?> runtimeExceptionHandler(RuntimeException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}
