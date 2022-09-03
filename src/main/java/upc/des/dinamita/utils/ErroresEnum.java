package upc.des.dinamita.utils;

import lombok.Getter;

@Getter
public enum ErroresEnum {
    OK(200, "OK"),
    SEARCH_ERROR(201, "Ocurrió un error al buscar en base de datos"),
    LIBRO_NOT_FOUND(202, "No se encontró libro");

    private final int errorCode;
    private final String errorMessage;

    ErroresEnum(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
