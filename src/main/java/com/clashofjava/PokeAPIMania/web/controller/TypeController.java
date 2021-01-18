package com.clashofjava.PokeAPIMania.web.controller;

import com.clashofjava.PokeAPIMania.domain.Types;
import com.clashofjava.PokeAPIMania.domain.service.TypeService;
import com.clashofjava.PokeAPIMania.persistence.crud.TypeCrudRepositorio;
import com.clashofjava.PokeAPIMania.persistence.entity.Tipo;
import com.clashofjava.PokeAPIMania.web.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/types")
public class TypeController {
    @Autowired
    private TypeCrudRepositorio typeCrudRepositorio;

    @Autowired
    private TypeService typeService;

    @GetMapping("/all")
    public List<Types> getAll() {
        return typeService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Types> getType(int typeId) {
        return typeService.getType(typeId)
                .map(type -> new ResponseEntity<>(type, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/type/{typeid}")
    public Tipo getTypeId(@PathVariable(value = "typeid") int typeId) {
        return typeCrudRepositorio.findById(typeId)
                .orElseThrow(() -> new ResourceNotFoundException("Type", "typeid", typeId));
    }


    @PostMapping("/save")
    public ResponseEntity<Types> savePokemon(@RequestBody Types type) {
        Types newType = typeService.save(type);
        return ResponseEntity.ok(newType);
    }

    @DeleteMapping("/delete/{typeId}")
    public ResponseEntity<Void> deletePokemon(@PathVariable("typeId") int typeId) {
        typeService.delete(typeId);
        return ResponseEntity.ok(null);
    }

    @PutMapping("/update/{typeid}")
    public ResponseEntity<Types> updateType(@PathVariable(value = "typeid") int typeId,
                                            @RequestBody Types newType) {

        Tipo tipo = typeCrudRepositorio.findById(typeId)
                .orElseThrow(() -> new ResourceNotFoundException("Types", "typeid", typeId));

        tipo.setIdTipo(newType.getTypeId());
        tipo.setTipo(newType.getType());
        tipo.setDetalle(newType.getDetail());

        Types tipoActualizado= typeService.save(newType);
        return ResponseEntity.ok(tipoActualizado);
    }

}
