package com.clashofjava.PokeAPIMania.domain.repository;

import com.clashofjava.PokeAPIMania.persistence.entity.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface PokemonRepository {

    @Autowired
    List<Pokemon> getAll();
}
