package com.clashofjava.PokeAPIMania.domain.service;

import com.clashofjava.PokeAPIMania.domain.Types;
import com.clashofjava.PokeAPIMania.domain.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeService {
    @Autowired
    private TypeRepository typeRepository;

    public List<Types> getAll(){
        return typeRepository.getAll();
    }


    public Optional<Types> getType(int typeId) {
        return typeRepository.getType(typeId);
    }

    public Types save(Types type) {
        return typeRepository.save(type);
    }

    public boolean delete(int typeId) {
        return getType(typeId).map(type -> {
            typeRepository.delete(typeId);
            return true;
        }).orElse(false);
    }
}
