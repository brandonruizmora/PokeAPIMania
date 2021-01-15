package com.clashofjava.PokeAPIMania.persistence.mapper;

import com.clashofjava.PokeAPIMania.domain.Type;
import com.clashofjava.PokeAPIMania.persistence.entity.Tipo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface TypeMapper {

    @Mappings({
            @Mapping(source = "idTipo",target = "typeId"),
            @Mapping(source = "nombreTipo",target = "typeName")
    })
    Type toType(Tipo tipo);


    @InheritInverseConfiguration
    @Mapping(target = "evolucion", ignore = true)
    Tipo toTipo(Type type);
}
