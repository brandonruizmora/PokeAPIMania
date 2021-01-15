package com.clashofjava.PokeAPIMania.domain.repository;

import com.clashofjava.PokeAPIMania.persistence.entity.Pokemon;

import java.util.List;
import java.util.Optional;

public interface PokemoRepository {

    List<Pokemon> getAll();
    Optional<List<Pokemon>> getByCategory(int categoryId);

    Optional<Pokemon> getPokemon(int pokemonId);

    Optional<Pokemon> getByType(int idTipo);
    Pokemon save(Pokemon pokemon);

    void delete(int pokemonId);
}
