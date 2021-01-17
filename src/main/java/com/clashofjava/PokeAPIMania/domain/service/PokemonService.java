package com.clashofjava.PokeAPIMania.domain.service;

import com.clashofjava.PokeAPIMania.domain.Pokemon;
import com.clashofjava.PokeAPIMania.domain.repository.PokemonRepository;
import com.clashofjava.PokeAPIMania.persistence.entity.Poqemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;

    public List<Pokemon> getAll(){
        return pokemonRepository.getAll();
    }


    public Optional<Pokemon> getPokemon(int pokemonId) {
        return pokemonRepository.getPokemon(pokemonId);
    }

    public Pokemon save(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    public boolean delete(int pokemonId) {
        return getPokemon(pokemonId).map(product -> {
            pokemonRepository.delete(pokemonId);
            return true;
        }).orElse(false);
    }
}
