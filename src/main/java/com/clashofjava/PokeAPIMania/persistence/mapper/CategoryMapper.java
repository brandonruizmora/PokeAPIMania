package com.clashofjava.PokeAPIMania.persistence.mapper;

import com.clashofjava.PokeAPIMania.domain.service.CategoryService;
import com.clashofjava.PokeAPIMania.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idCategoria",target = "categoryId"),
            @Mapping(source = "categoria",target = "category")
    })
    CategoryService toCategory(Categoria categoria);

    @InheritInverseConfiguration
    @Mapping(target = "evolucion", ignore = true)
    Categoria toCategoria(CategoryService category);
}