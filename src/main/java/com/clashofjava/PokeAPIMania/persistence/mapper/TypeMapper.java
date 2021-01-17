package com.clashofjava.PokeAPIMania.persistence.mapper;

import com.clashofjava.PokeAPIMania.domain.Types;
import com.clashofjava.PokeAPIMania.persistence.entity.Tipo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TypeMapper {

    @Mappings({
            @Mapping(source = "idTipo", target = "typeId"),
            @Mapping(source = "tipo", target = "type"),
            @Mapping(source = "detalle", target = "detail")
    })
    Types toType(Tipo tipo);
    List<Types> toTypes(List<Tipo> tipos);

    @InheritInverseConfiguration
    Tipo toTipo(Types type);
}
