package com.clashofjava.PokeAPIMania.persistence.mapper;

import com.clashofjava.PokeAPIMania.domain.Types;
import com.clashofjava.PokeAPIMania.persistence.entity.Tipos;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface TypesMapper {

    @Mappings({
            @Mapping(source = "idTipo", target = "typeId"),
            @Mapping(source = "tipo", target = "type"),
            @Mapping(source = "detalle", target = "detail")
    })
    Types toTypes(Tipos tipos);

    @InheritInverseConfiguration
    Tipos toTipos(Types types);
}
