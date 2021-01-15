package com.clashofjava.PokeAPIMania.domain.service;


import com.clashofjava.PokeAPIMania.domain.Pokemon;
import com.clashofjava.PokeAPIMania.domain.repository.PokemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemoService {
    @Autowired
    private PokemoRepository pokemonRepository;

    public List<com.clashofjava.PokeAPIMania.domain.Pokemon> getAll() {
        return pokemonRepository.getAll();
    }

    public Optional<com.clashofjava.PokeAPIMania.domain.Pokemon> getPokemon(int pokemonId) {
        return pokemonRepository.getPokemon(pokemonId);
    }

    public Optional<com.clashofjava.PokeAPIMania.domain.Pokemon> getByType(int typeId) {
        return pokemonRepository.getPokemon(typeId);
    }

    public com.clashofjava.PokeAPIMania.domain.Pokemon save(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    public boolean delete(int pokemonId) {
        return getPokemon(pokemonId).map(pokemon -> {
            pokemonRepository.delete(pokemonId);
            return true;
        }).orElse(false);
    }
}
