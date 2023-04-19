package com.gustadev.calculator.config;

import com.gustadev.calculator.exception.MyOwnErrorDecoderException;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;

public class ExceptionFeingHandlerConfig {
    @Bean
    public ErrorDecoder errorDecoder(){
        return new MyOwnErrorDecoderException();
    }
}
