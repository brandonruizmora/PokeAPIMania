package com.clashofjava.PokeAPIMania.domain;

import com.clashofjava.PokeAPIMania.persistence.entity.Categoria;
import com.clashofjava.PokeAPIMania.persistence.entity.Tipo;

public class Evolution {
    private int evolutionId;
    private String nameEvolution;
    private boolean evolution;
    private int typeId;
    private Tipo type;
    private Categoria category;

    public int getEvolutionId() {
        return evolutionId;
    }

    public void setEvolutionId(int evolutionId) {
        this.evolutionId = evolutionId;
    }

    public String getNameEvolution() {
        return nameEvolution;
    }

    public void setNameEvolution(String nameEvolution) {
        this.nameEvolution = nameEvolution;
    }

    public boolean isEvolution() {
        return evolution;
    }

    public void setEvolution(boolean evolution) {
        this.evolution = evolution;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public Tipo getType() {
        return type;
    }

    public void setType(Tipo type) {
        this.type = type;
    }

    public Categoria getCategory() {
        return category;
    }

    public void setCategory(Categoria category) {
        this.category = category;
    }
}
