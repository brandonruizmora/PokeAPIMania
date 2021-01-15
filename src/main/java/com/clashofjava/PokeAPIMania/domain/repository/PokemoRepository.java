package com.clashofjava.PokeAPIMania.domain.repository;

import com.clashofjava.PokeAPIMania.persistence.entity.Pokemon;

import java.util.List;
import java.util.Optional;

public interface PokemoRepository {
<<<<<<< Updated upstream

    List<Pokemon> getAll();
    Optional<List<Pokemon>> getByCategory(int categoryId);

    Optional<Pokemon> getPokemon(int pokemonId);

    Optional<Pokemon> getByType(int idTipo);
    Pokemon save(Pokemon pokemon);

=======
    List<com.clashofjava.PokeAPIMania.domain.Pokemon> getAll();
    Optional<com.clashofjava.PokeAPIMania.domain.Pokemon> getPokemon(int pokemonId);
    Optional<com.clashofjava.PokeAPIMania.domain.Pokemon> getByType(int pokemonId);
    com.clashofjava.PokeAPIMania.domain.Pokemon save(Pokemon pokemon);
>>>>>>> Stashed changes
    void delete(int pokemonId);
}
