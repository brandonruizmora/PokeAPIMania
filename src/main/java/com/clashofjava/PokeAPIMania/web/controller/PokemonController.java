package com.clashofjava.PokeAPIMania.web.controller;


import com.clashofjava.PokeAPIMania.domain.Pokemon;
import com.clashofjava.PokeAPIMania.domain.service.PokemoService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {
    @Autowired
    private PokemoService pokemonService;

    @GetMapping("/all")
    @ApiOperation("Get All pokemon")
    @ApiResponse(code = 200, message = "Ok")
    public ResponseEntity<List<Pokemon>> getAll() {
        return new ResponseEntity<>(pokemonService.getAll(), HttpStatus.OK);
    }


    @GetMapping("/{id}")
    @ApiOperation("Search a pokemon with an ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Pokemon Not found")
    })
    public ResponseEntity<Pokemon> getPokemon(@ApiParam(value = "The id of the pokemon", required = true, example = "7") @PathVariable("id") int pokemonId) {
        return pokemonService.getPokemon(pokemonId)
                .map(pokemon -> new ResponseEntity<>(pokemon, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/type/{typeId}")
    public ResponseEntity<Pokemon> getByType(@PathVariable("typeId") int typeId) {
        return pokemonService.getByType(typeId)
                .map(type -> new ResponseEntity<>(type, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Pokemon> save(@RequestBody Pokemon pokemon) {
        return new ResponseEntity<>(pokemonService.save(pokemon), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int pokemonId) {
        if (pokemonService.delete(pokemonId)) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}