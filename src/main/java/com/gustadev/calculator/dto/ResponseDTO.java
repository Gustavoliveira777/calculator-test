package com.gustadev.calculator.dto;


import com.gustadev.calculator.model.Result;

import java.util.List;

public record ResponseDTO(List<Result> results) {
}
