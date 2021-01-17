package com.clashofjava.PokeAPIMania.domain.repository;

import com.clashofjava.PokeAPIMania.domain.Types;

import java.util.List;
import java.util.Optional;

public interface TypeRepository {
    List<Types> getAll();
    Optional<List<Types>> getByTypeId(int typeId);
    Optional<Types> getType(int typeId);
    Types save(Types type);
    void delete(int typeId);
}
