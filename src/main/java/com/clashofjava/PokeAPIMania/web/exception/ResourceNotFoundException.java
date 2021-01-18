package com.clashofjava.PokeAPIMania.web.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ResourceNotFoundException extends RuntimeException {
    private String tabla;
    private String columna;
    private Object valor;

    public ResourceNotFoundException( String tabla, String columna, Object valor) {
        super(String.format("%s inexistente con %s : '%s'", tabla, columna, valor));
        this.tabla = tabla;
        this.columna = columna;
        this.valor = valor;
    }

    public String getTabla() {
        return tabla;
    }

    public String getColumna() {
        return columna;
    }

    public Object getValor() {
        return valor;
    }
}