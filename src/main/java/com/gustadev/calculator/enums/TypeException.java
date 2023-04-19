package com.gustadev.calculator.enums;

public enum TypeException {
    CRITICA_NEGOCIO("Crítica de Negócio"),
    ERRO_TECNICO("Erro técnico");
    private String value;
    TypeException(String value){
        this.value = value;
    }
}
