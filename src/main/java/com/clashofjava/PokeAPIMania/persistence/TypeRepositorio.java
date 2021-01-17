package com.clashofjava.PokeAPIMania.persistence;

import com.clashofjava.PokeAPIMania.domain.Types;
import com.clashofjava.PokeAPIMania.domain.repository.TypeRepository;
import com.clashofjava.PokeAPIMania.persistence.crud.TypeCrudRepositorio;
import com.clashofjava.PokeAPIMania.persistence.entity.Tipo;
import com.clashofjava.PokeAPIMania.persistence.mapper.TypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TypeRepositorio implements TypeRepository {

    @Autowired
    private TypeCrudRepositorio typeCrudRepositorio;
    @Autowired
    private TypeMapper mapper;

    @Override
    public List<Types> getAll(){
        List<Tipo> tipos = (List<Tipo>) typeCrudRepositorio.findAll();
        return mapper.toTypes(tipos);
    }

    @Override
    public Optional<List<Types>> getByTypeId(int typeId) {
        return Optional.empty();
    }

    @Override
    public Optional<Types> getType(int typeId) {
        return typeCrudRepositorio.findById(typeId).map(type -> mapper.toType(type));
    }

    @Override
    public Types save(Types type) {
        Tipo tipo = mapper.toTipo(type);
        return mapper.toType(typeCrudRepositorio.save(tipo));
    }

    @Override
    public void delete(int idTipo){
        typeCrudRepositorio.deleteById(idTipo);
    }
}
