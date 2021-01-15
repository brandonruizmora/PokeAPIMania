package com.clashofjava.PokeAPIMania.persistence.mapper;

import com.clashofjava.PokeAPIMania.domain.Pokemo;
import com.clashofjava.PokeAPIMania.persistence.entity.Pokemon;
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
    Pokemo toPokemo(Pokemon pokemon);
    List<Pokemo> toPokemons(List<Pokemon> pokemons);

}
