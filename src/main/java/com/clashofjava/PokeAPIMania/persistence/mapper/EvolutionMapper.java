package com.clashofjava.PokeAPIMania.persistence.mapper;

import com.clashofjava.PokeAPIMania.domain.service.EvolutionService;
import com.clashofjava.PokeAPIMania.domain.service.EvolutionService;
import com.clashofjava.PokeAPIMania.persistence.entity.Evolucion;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {TypeMapper.class})
public interface EvolutionMapper {

    @Mappings({
            @Mapping(source = "idEvoluccion",target = "evolutionId"),
            @Mapping(source = "nombreEvolucion",target = "evolutionName"),
            @Mapping(source = "evolucion",target = "evolution"),
            @Mapping(source = "idTipo",target = "typeId"),
            @Mapping(source = "idCategoria",target = "categoryId"),
            @Mapping(source = "tipo",target = "type")
    })
    EvolutionService toEvolution(Evolucion evolucion);

    @InheritInverseConfiguration
    @Mapping(target = "categoria", ignore = true)
    Evolucion toEvolucion(EvolutionService evolution);
}