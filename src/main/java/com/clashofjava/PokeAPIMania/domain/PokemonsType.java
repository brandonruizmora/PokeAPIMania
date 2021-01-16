package com.clashofjava.PokeAPIMania.domain;

public class PokemonsType {
    private Pokemons pokemons;
    private int primaryTypeId;
    private int secondTypeId;

    public Pokemons getPokemons() {
        return pokemons;
    }

    public void setPokemons(Pokemons pokemons) {
        this.pokemons = pokemons;
    }

    public int getPrimaryTypeId() {
        return primaryTypeId;
    }

    public void setPrimaryTypeId(int primaryTypeId) {
        this.primaryTypeId = primaryTypeId;
    }

    public int getSecondTypeId() {
        return secondTypeId;
    }

    public void setSecondTypeId(int secondTypeId) {
        this.secondTypeId = secondTypeId;
    }
}
