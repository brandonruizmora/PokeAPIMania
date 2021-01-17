package com.clashofjava.PokeAPIMania.domain.repository;

import com.clashofjava.PokeAPIMania.domain.Pokemon;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public interface PokemonRepository {

    List<Pokemon> getAll();
    Optional<List<Pokemon>> getByPokemon(int pokemonId);
    Optional<Pokemon> getPokemon(int pokemonId);
    Pokemon save(Pokemon pokemon);
    void delete(int pokemonId);
    Pokemon update(Pokemon pokemon);
}
