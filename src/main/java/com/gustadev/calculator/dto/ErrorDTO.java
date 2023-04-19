package com.gustadev.calculator.dto;

import com.gustadev.calculator.enums.TypeException;

public record ErrorDTO(TypeException type, String errorCode, String message) {
}
