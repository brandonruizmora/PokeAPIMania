package com.clashofjava.PokeAPIMania.persistence.mapper;

import com.clashofjava.PokeAPIMania.domain.PokemonsType;
import com.clashofjava.PokeAPIMania.persistence.entity.TipoPokemones;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {PokemonsMapper.class})
public interface PokemonsTypeMapper {

    @Mappings({
            @Mapping(source = "pokemones", target = "pokemons"),
            @Mapping(source = "idTipoPrimaria", target = "primaryTypeId"),
            @Mapping(source = "idTipoSecundario", target = "secondTypeId")
    })
    PokemonsType toPokemonType(TipoPokemones tipoPokemones);

    @InheritInverseConfiguration
    TipoPokemones toTipoPokemones(PokemonsType pokemonsType);
}
