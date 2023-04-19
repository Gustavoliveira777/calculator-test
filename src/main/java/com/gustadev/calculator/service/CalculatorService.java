package com.gustadev.calculator.service;

import com.gustadev.calculator.client.CalculeitorClient;
import com.gustadev.calculator.dto.RequestDTO;
import com.gustadev.calculator.dto.ResponseDTO;
import com.gustadev.calculator.model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CalculatorService {
    @Autowired
    private CalculeitorClient client;
    public ResponseDTO calcular(Double numA, Double numB, String meuOvo){
        ResponseEntity<ResponseDTO> resp = client.soma(numA,numB, meuOvo);
        return resp.getBody();
    }
}
