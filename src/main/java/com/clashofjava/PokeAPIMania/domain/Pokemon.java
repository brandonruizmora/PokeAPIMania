package com.clashofjava.PokeAPIMania.domain;

public class Pokemon {

    private int pokemonId;
    private String pokemon;
    private String detail;
    private Boolean evolution;

    public int getPokemonId() {
        return pokemonId;
    }

    public void setPokemonId(int pokemonId) {
        this.pokemonId = pokemonId;
    }

    public String getPokemon() {
        return pokemon;
    }

    public void setPokemon(String pokemon) {
        this.pokemon = pokemon;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Boolean getEvolution() {
        return evolution;
    }

    public void setEvolution(Boolean evolution) {
        this.evolution = evolution;
    }
}
