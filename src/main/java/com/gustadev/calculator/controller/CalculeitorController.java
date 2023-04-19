package com.gustadev.calculator.controller;


import com.gustadev.calculator.dto.RequestDTO;
import com.gustadev.calculator.dto.ResponseDTO;
import com.gustadev.calculator.enums.Operation;
import com.gustadev.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/calculator")
public class CalculeitorController {
    @Autowired
    private CalculatorService service;
    @GetMapping("/soma")
    public ResponseEntity<ResponseDTO> getSoma(
            @RequestHeader("X-egg") String meuOvo,
            @RequestParam Double numA,
                                               @RequestParam Double numB){
        return ResponseEntity.ok(service.calcular(numA,numB,meuOvo));

    }

//    @GetMapping("/subtracao")
//    public ResponseEntity<ResponseDTO> getSubt(@RequestParam Double numA,
//                                               @RequestParam Double numB){
//        return ResponseEntity.ok(service.core(new RequestDTO(Arrays.asList(numA,numB), Arrays.asList(Operation.SUBTRACAO))));
//
//    }
//
//    @GetMapping("/multiplicacao")
//    public ResponseEntity<ResponseDTO> getMultipl(@RequestParam Double numA,
//                                               @RequestParam Double numB){
//        return ResponseEntity.ok(service.core(new RequestDTO(Arrays.asList(numA,numB), Arrays.asList(Operation.MULTIPLICACAO))));
//
//    }
//
//    @GetMapping("/divisao")
//    public ResponseEntity<ResponseDTO> getDiv(@RequestParam Double numA,
//                                                  @RequestParam Double numB){
//        return ResponseEntity.ok(service.core(new RequestDTO(Arrays.asList(numA,numB), Arrays.asList(Operation.DIVISAO))));
//
//    }
}
