package com.clashofjava.PokeAPIMania.domain.service;

import com.clashofjava.PokeAPIMania.domain.Pokemon;
import com.clashofjava.PokeAPIMania.domain.repository.PokemonRepository;
import com.clashofjava.PokeAPIMania.persistence.entity.Poqemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;

    public List<Pokemon> getAll(){
        return pokemonRepository.getAll();
    }
}
