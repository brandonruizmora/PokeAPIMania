package com.clashofjava.PokeAPIMania.domain;

public class Pokemons {
    private int pokemonId;
    private String pokemon;
    private String detail;
    private boolean evolution;

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

    public boolean isEvolution() {
        return evolution;
    }

    public void setEvolution(boolean evolution) {
        this.evolution = evolution;
    }
}
