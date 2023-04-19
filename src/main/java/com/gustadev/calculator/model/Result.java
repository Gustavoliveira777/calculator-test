package com.gustadev.calculator.model;

import com.gustadev.calculator.enums.Operation;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Result implements Serializable {
    private Double result;
    private Operation operation;
}
