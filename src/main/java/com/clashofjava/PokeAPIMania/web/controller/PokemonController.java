
package com.clashofjava.PokeAPIMania.web.controller;
/**
 * Clase PokemonController
 *
 * Contiene informacion del crud que puede hacer el API
 *
 * @author clash of java
 * @version 1.0
 */
import com.clashofjava.PokeAPIMania.domain.Pokemon;
import com.clashofjava.PokeAPIMania.domain.service.PokemonService;
import com.clashofjava.PokeAPIMania.persistence.entity.Pokemon;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokemons")
public class PokemonController {
    
    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/all")
    @ApiOperation("Get all the name of pokemons")
    @ApiResponse(code = 200, message = "Ok")
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
    @ApiOperation("Search a pokemon with an ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Pokemon Not found")
    })
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
