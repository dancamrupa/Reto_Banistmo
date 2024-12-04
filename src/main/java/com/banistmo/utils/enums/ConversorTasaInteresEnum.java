package com.banistmo.utils.enums;

public enum ConversorTasaInteresEnum {
    TASA_INTERES_ENUM("20"),
    ANUAL("Anual"),
    MENSUAL("Mensual"),
    PORCENTAJE_TASA_NOMINAL_EFECTIVA("21.94 %");

    private final String message;

    ConversorTasaInteresEnum(String message) {
        this.message = message;
    }

    public String getDataTasaInteres() {
        return message;
    }
}