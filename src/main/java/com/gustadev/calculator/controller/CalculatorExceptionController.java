package com.gustadev.calculator.controller;

import com.gustadev.calculator.dto.ErrorDTO;
import com.gustadev.calculator.enums.TypeException;
import feign.FeignException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CalculatorExceptionController {
    @ExceptionHandler(FeignException.class)
    ResponseEntity<ErrorDTO> feingExceptionCritica(FeignException ex) {
        if (ex instanceof FeignException.FeignClientException) {
            return ResponseEntity.status(ex.status()).body(new ErrorDTO(TypeException.CRITICA_NEGOCIO, String.valueOf(ex.status()), ex.contentUTF8()));
        } else{
            return ResponseEntity.status(ex.status()).body(new ErrorDTO(TypeException.ERRO_TECNICO, String.valueOf(ex.status()), ex.contentUTF8()));
        }
    }
}
