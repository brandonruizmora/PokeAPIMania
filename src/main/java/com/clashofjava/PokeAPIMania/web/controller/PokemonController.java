package com.clashofjava.PokeAPIMania.web.controller;

import com.clashofjava.PokeAPIMania.domain.Pokemon;
import com.clashofjava.PokeAPIMania.domain.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pokemons")
public class PokemonController {
    
    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/all")
    public List<Pokemon> getAll() {
        return pokemonService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pokemon> getProduct(int productId) {
        return pokemonService.getPokemon(productId)
                .map(product -> new ResponseEntity<>(product, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Pokemon> savePokemon(@RequestBody Pokemon pokemon) {
        Pokemon newPokemon = pokemonService.save(pokemon);
        return ResponseEntity.ok(newPokemon);
    }

    @DeleteMapping("/delete/{pokemonId}")
    public ResponseEntity deletePokemon(@PathVariable("pokemonId") int pokemonId) {
        pokemonService.delete(pokemonId);
        if (pokemonService.delete(pokemonId)) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
/*
    @PutMapping("/update")
    public ResponseEntity<Pokemon> updatePokemon(@RequestBody Pokemon pokemon){
        Optional<Pokemon> optionalPokemon = pokemonService.findById(pokemon.getPokemonId());
        if(optionalPokemon.isPresent()){
            Pokemon updatePokemon = optionalPokemon.get();
            updatePokemon.setPokemon(pokemon.getPokemon());
            pokemonService.save(updatePokemon);
            return ResponseEntity.ok(updatePokemon);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
 */
}
