package com.clashofjava.PokeAPIMania.persistence.crud;

import com.clashofjava.PokeAPIMania.domain.Pokemon;
import com.clashofjava.PokeAPIMania.persistence.entity.Poqemon;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PokemonCrudRepositorio extends CrudRepository<Poqemon, Integer> {

    Optional<List<Poqemon>> findById(String idPokemon);
}
