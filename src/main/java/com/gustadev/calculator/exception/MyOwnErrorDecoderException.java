package com.gustadev.calculator.exception;

import com.gustadev.calculator.enums.TypeException;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.http.HttpStatus;

import java.nio.charset.Charset;

public class MyOwnErrorDecoderException implements ErrorDecoder {
    @Override
    public Exception decode(String s, Response response){
        HttpStatus status = HttpStatus.valueOf(response.status());
        Response.Body body = response.body();
//        body.asReader(Charset.defaultCharset())
        if(status.is4xxClientError()){
            return new MyOwnException(status,"Houve uma crítica de negócio", response.body().toString(), TypeException.CRITICA_NEGOCIO);
        }else{
            return new MyOwnException(status,"Houve um erro técnico", response.body().toString(), TypeException.CRITICA_NEGOCIO);
        }
    }
}
