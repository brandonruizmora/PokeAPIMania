package com.clashofjava.PokeAPIMania.domain.service;
/**
 * Clase PokemonService
 *
 * Contiene informacion de los servicios del crud que se usan
 *
 * @author clash of java
 * @version 1.0
 */
import com.clashofjava.PokeAPIMania.domain.Pokemon;
import com.clashofjava.PokeAPIMania.domain.repository.PokemonRepository;
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

    public Pokemon updatePokemon(Pokemon pokemon){
        return pokemonRepository.update(pokemon);
    }
    public void update(Pokemon pokemon, int pokemonId)
    {
        pokemonRepository.save(pokemon);
    }

}
