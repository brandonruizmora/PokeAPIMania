package com.clashofjava.PokeAPIMania.persistence;

import com.clashofjava.PokeAPIMania.domain.Pokemon;
import com.clashofjava.PokeAPIMania.domain.repository.PokemonRepository;
import com.clashofjava.PokeAPIMania.persistence.crud.PokemonCrudRepositorio;
import com.clashofjava.PokeAPIMania.persistence.entity.Poqemon;
import com.clashofjava.PokeAPIMania.persistence.mapper.PokemonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PokemonRepositorio implements PokemonRepository {
    @Autowired
    private PokemonCrudRepositorio pokemonCrudRepositorio;
    @Autowired
    private PokemonMapper mapper;

    @Override
    public List<Pokemon> getAll(){
        List<Poqemon> pokemones = (List<Poqemon>) pokemonCrudRepositorio.findAll();
        return mapper.toPokemons(pokemones);
    }

    @Override
    public Optional<List<Pokemon>> getByPokemon(int pokemonId) {
        return Optional.empty();
    }

    @Override
    public Optional<Pokemon> getPokemon(int pokemonId) {
        return pokemonCrudRepositorio.findById(pokemonId).map(pokemon -> mapper.toPokemon(pokemon));
    }

    @Override
    public Pokemon save(Pokemon pokemon) {
        Poqemon poqemon = mapper.toPoqemon(pokemon);
        return mapper.toPokemon(pokemonCrudRepositorio.save(poqemon));
    }


    @Override
    public void delete(int idPokemon){
        pokemonCrudRepositorio.deleteById(idPokemon);
    }

}
