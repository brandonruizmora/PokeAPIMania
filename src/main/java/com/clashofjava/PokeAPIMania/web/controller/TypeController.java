package com.clashofjava.PokeAPIMania.web.controller;

import com.clashofjava.PokeAPIMania.domain.Types;
import com.clashofjava.PokeAPIMania.domain.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/types")
public class TypeController {
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

}
