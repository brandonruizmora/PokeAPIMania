package com.clashofjava.PokeAPIMania.persistence.mapper;

import com.clashofjava.PokeAPIMania.domain.Pokemon;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface PokemoMapper {
    @Mappings({
            @Mapping(source = "idPokemon",target = "pokemonId"),
            @Mapping(source = "nombrePokemon",target = "pokemonName"),
            @Mapping(source = "tipoPokemon",target = "pokemonType"),
    })
    Pokemon toPokemo(com.clashofjava.PokeAPIMania.persistence.entity.Pokemon pokemon);
    List<Pokemon> toPokemons(List<com.clashofjava.PokeAPIMania.persistence.entity.Pokemon> pokemons);

}
