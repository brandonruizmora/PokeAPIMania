package com.clashofjava.PokeAPIMania.persistence.mapper;

import com.clashofjava.PokeAPIMania.domain.Pokemons;
import com.clashofjava.PokeAPIMania.persistence.entity.Pokemones;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface PokemonsMapper {
    
    @Mappings({
            @Mapping(source = "idPokemon", target = "pokemonId"),
            @Mapping(source = "pokemon", target = "pokemon"),
            @Mapping(source = "detalle", target = "detail"),
            @Mapping(source = "evolucion", target = "evolution")
    })
    Pokemons toPokemons(Pokemones pokemones);

    @InheritInverseConfiguration
    Pokemones toPokemones(Pokemons pokemons);
}
