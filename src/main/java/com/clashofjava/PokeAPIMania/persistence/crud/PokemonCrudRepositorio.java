package com.clashofjava.PokeAPIMania.persistence.crud;

import com.clashofjava.PokeAPIMania.persistence.entity.Poqemon;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PokemonCrudRepositorio extends CrudRepository<Poqemon, Integer> {

}
