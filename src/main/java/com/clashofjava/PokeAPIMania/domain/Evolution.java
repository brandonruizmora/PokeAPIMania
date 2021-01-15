package com.clashofjava.PokeAPIMania.domain;

public class Evolution {
    private int evolutionId;
    private String evolutionName;
    private boolean evolution;
    private int typeId;
    private int categoryId;
    private Type type;

    public int getEvolutionId() {
        return evolutionId;
    }

    public void setEvolutionId(int evolutionId) {
        this.evolutionId = evolutionId;
    }

    public String getEvolutionName() {
        return evolutionName;
    }

    public void setEvolutionName(String evolutionName) {
        this.evolutionName = evolutionName;
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

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
