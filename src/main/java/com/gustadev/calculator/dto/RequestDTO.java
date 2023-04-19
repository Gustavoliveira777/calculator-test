package com.gustadev.calculator.dto;


import com.gustadev.calculator.enums.Operation;

import java.util.List;

public record RequestDTO(List<Double> numbs, List<Operation> operations) {

}
