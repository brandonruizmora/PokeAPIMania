package com.clashofjava.PokeAPIMania.domain.service;


import com.clashofjava.PokeAPIMania.domain.repository.PokemoRepository;
import com.clashofjava.PokeAPIMania.persistence.entity.Pokemon;
import com.clashofjava.PokeAPIMania.persistence.entity.Tipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemoService {
    @Autowired
    private PokemoRepository pokemoRepository;

    public List<Pokemon> getAll(){
        return pokemoRepository.getAll();
    }
    public Optional<Pokemon> getPokemon(int pokemonId){
        return pokemoRepository.getPokemon(pokemonId);
    }
    public Optional<Pokemon> getByType(int idTipo){
        return pokemoRepository.getByType(idTipo);
    }

    public Pokemon save(Pokemon pokemon){
        return pokemoRepository.save(pokemon);
    }

    public boolean delete(int pokemonId){
        return getPokemon(pokemonId).map(pokemon -> {
            pokemoRepository.delete(pokemonId);
            return true;
        }).orElse(false);
    }
}
