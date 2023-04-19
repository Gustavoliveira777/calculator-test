package com.gustadev.calculator.enums;

public enum Operation {
    SOMA("+"),
    MULTIPLICACAO("*"),
    DIVISAO("/"),
    SUBTRACAO("-");
    String value;
    Operation(String value){
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }
}
