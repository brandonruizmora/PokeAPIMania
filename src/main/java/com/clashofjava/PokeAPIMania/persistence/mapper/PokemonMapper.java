package com.clashofjava.PokeAPIMania.persistence.mapper;

import com.clashofjava.PokeAPIMania.domain.Pokemon;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PokemonMapper {

    @Mappings({
            @Mapping(source = "idPokemon",target = "pokemonId"),
            @Mapping(source = "nombrePokemon",target = "pokemonName")
    })
    Pokemon toPokemon(com.clashofjava.PokeAPIMania.persistence.entity.Pokemon pokemon);
    List<Pokemon> toPokemon(List<com.clashofjava.PokeAPIMania.persistence.entity.Pokemon> pokemon);

    @InheritInverseConfiguration
    @Mapping(target = "tipoPokemon", ignore = true)
    com.clashofjava.PokeAPIMania.persistence.entity.Pokemon toPokemon(Pokemon pokemon);
}