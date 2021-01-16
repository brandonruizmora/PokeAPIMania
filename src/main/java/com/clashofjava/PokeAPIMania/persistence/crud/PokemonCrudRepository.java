package com.clashofjava.PokeAPIMania.persistence.crud;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PokemonCrudRepository extends CrudRepository<Pokemon, Integer>{

    Optional<List<Pokemon>> findByIdPokemon(String idPokemon);
    Optional<List<Pokemon>> findByName (int nombrePokemon);
}
