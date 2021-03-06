package com.clashofjava.PokeAPIMania.persistence.mapper;

import com.clashofjava.PokeAPIMania.domain.Pokemon;
import com.clashofjava.PokeAPIMania.persistence.entity.Poqemon;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper( componentModel = "spring")
public interface PokemonMapper {

    @Mappings({
            @Mapping(source = "idPokemon", target = "pokemonId"),
            @Mapping(source = "pokemon", target = "pokemon"),
            @Mapping(source = "detalle", target = "detail"),
            @Mapping(source = "evolucion", target = "evolution"),
    })
    Pokemon toPokemon(Poqemon poqemon);

    List<Pokemon> toPokemons(List<Poqemon> pokemones);

    @InheritInverseConfiguration
    Poqemon toPoqemon(Pokemon pokemon);

}
