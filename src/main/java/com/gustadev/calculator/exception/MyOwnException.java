package com.gustadev.calculator.exception;

import com.gustadev.calculator.enums.TypeException;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
@Getter
@Setter
public class MyOwnException extends Exception{
    private HttpStatus statusCode;
    private String message;
    private String body;
    private TypeException type;
    public MyOwnException(HttpStatus statusCode, String message,String body,TypeException type){
        super(message);
        this.body = body;
        this.statusCode = statusCode;
        this.type = type;
    }
}
