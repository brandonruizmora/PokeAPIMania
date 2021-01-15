package com.clashofjava.PokeAPIMania.persistence.crud;

import com.clashofjava.PokeAPIMania.persistence.entity.Pokemon;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PokemonCrudRepository extends CrudRepository<Pokemon, Integer>{

    Optional<List<Pokemon>> findByIdPokemon(String idPokemon);
    Optional<List<Pokemon>> findByName (String nombrePokemon);
}
