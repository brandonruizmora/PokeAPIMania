package com.clashofjava.PokeAPIMania.domain.repository;

import com.clashofjava.PokeAPIMania.domain.Pokemon;

import java.util.List;
import java.util.Optional;

public interface PokemoRepository {
    List<Pokemon> getAll();
    Optional<Pokemon> getPokemon(int pokemonId);
    Optional<Pokemon> getByType(int idTipo);
    Pokemon save(Pokemon pokemon);
    void delete(int pokemonId);
}
