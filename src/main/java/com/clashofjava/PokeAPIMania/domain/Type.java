package com.clashofjava.PokeAPIMania.domain;

import com.clashofjava.PokeAPIMania.persistence.entity.Evolucion;

public class Type {
    private int typeId;
    private String nameType;
    private Evolucion evolution;

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public Evolucion getEvolution() {
        return evolution;
    }

    public void setEvolution(Evolucion evolution) {
        this.evolution = evolution;
    }
}
