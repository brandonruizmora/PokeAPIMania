package com.clashofjava.PokeAPIMania.persistence;

import com.clashofjava.PokeAPIMania.domain.Pokimon;
import com.clashofjava.PokeAPIMania.persistence.crud.PokemonCrudRepository;
import com.clashofjava.PokeAPIMania.persistence.entity.Pokemon;
import com.clashofjava.PokeAPIMania.persistence.mapper.PokemonMapper;

import java.util.List;
import java.util.Optional;

public class PokemonRepository implements PokemonCrudRepository {
    private PokemonCrudRepository pokemonCrudRepository;
    private PokemonMapper mapper;

    public List<Pokimon> getAll(){
        List<Pokemon> pokemones = (List<Pokemon>) pokemonCrudRepository.findAll();
        return mapper.toPokimons(pokemones);
    }

    @Override
    public <S extends Pokemon> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Pokemon> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Pokemon> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Pokemon> findAll() {
        return null;
    }

    @Override
    public Iterable<Pokemon> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Pokemon entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Pokemon> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
