package com.clashofjava.PokeAPIMania.web.controller;

import com.clashofjava.PokeAPIMania.domain.Pokemon;
import com.clashofjava.PokeAPIMania.domain.service.PokemonService;
import com.clashofjava.PokeAPIMania.persistence.crud.PokemonCrudRepositorio;
import com.clashofjava.PokeAPIMania.persistence.entity.Poqemon;
import com.clashofjava.PokeAPIMania.web.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokemons")
public class PokemonController {
    @Autowired
    private PokemonCrudRepositorio pokemonCrudRepositorio;
    
    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/all")
    public List<Pokemon> getAll() {
        return pokemonService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pokemon> getPokemon(int pokemonId) {
        return pokemonService.getPokemon(pokemonId)
                .map(pokemon -> new ResponseEntity<>(pokemon, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/pokemon/{pokemonid}")
    public Poqemon getPokemonId(@PathVariable(value = "pokemonid") int pokemonId) {
        return pokemonCrudRepositorio.findById(pokemonId)
                .orElseThrow(() -> new ResourceNotFoundException("Pokemon", "pokemonid", pokemonId));
    }

    @PostMapping("/save")
    public ResponseEntity<Pokemon> savePokemon(@RequestBody Pokemon pokemon) {
        Pokemon newPokemon = pokemonService.save(pokemon);
        return ResponseEntity.ok(newPokemon);
    }

    @DeleteMapping("/delete/{pokemonId}")
    public ResponseEntity<Void> deletePokemon(@PathVariable("pokemonId") int pokemonId) {
        pokemonService.delete(pokemonId);
        return ResponseEntity.ok(null);
    }

    @PutMapping("/update/{pokemonid}")
    public ResponseEntity<Pokemon> updatePokemon(@PathVariable(value = "pokemonid") int pokemonId,
                                                 @RequestBody Pokemon nuevoPokemon) {

        Poqemon poqemon = pokemonCrudRepositorio.findById(pokemonId)
                .orElseThrow(() -> new ResourceNotFoundException("Pokemon", "pokemonid", pokemonId));

        poqemon.setIdPokemon(nuevoPokemon.getPokemonId());
        poqemon.setPokemon(nuevoPokemon.getPokemon());
        poqemon.setDetalle(nuevoPokemon.getDetail());
        poqemon.setEvolucion(nuevoPokemon.getEvolution());

        Pokemon pokemonActualizado= pokemonService.save(nuevoPokemon);
        return ResponseEntity.ok(pokemonActualizado);
    }

}
