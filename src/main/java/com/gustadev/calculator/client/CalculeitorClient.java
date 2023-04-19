package com.gustadev.calculator.client;

import com.gustadev.calculator.config.ExceptionFeingHandlerConfig;
import com.gustadev.calculator.dto.ResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

//Usar configuration caso não queira tratar a Exceção padrão do feing
@FeignClient(name = "Calculeitor",url="${calculeitor.url}")
public interface CalculeitorClient {
    @GetMapping("/soma")
    ResponseEntity<ResponseDTO> soma(@RequestParam("numA")Double numA, @RequestParam("numB")Double numB, @RequestHeader("X-egg") String meuOvo);
}
