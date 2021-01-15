package com.clashofjava.PokeAPIMania.domain.repository;

import com.clashofjava.PokeAPIMania.domain.Pokemon;

import java.util.List;
import java.util.Optional;

public interface PokemoRepository {

    List<com.clashofjava.PokeAPIMania.domain.Pokemon> getAll();
    Optional<com.clashofjava.PokeAPIMania.domain.Pokemon> getPokemon(int pokemonId);
    Optional<com.clashofjava.PokeAPIMania.domain.Pokemon> getByType(int pokemonId);
    com.clashofjava.PokeAPIMania.domain.Pokemon save(Pokemon pokemon);
    void delete(int pokemonId);
}
