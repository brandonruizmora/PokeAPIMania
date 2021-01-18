import React from "react";
import img from "../img/poke5.jpg";

const EditPokemon = ({pokemonData, handleClickEdit}) => {
  let pokemonName = "";
  let pokemonDetail = "";
  let pokemonEvolution = "";
  const handleChangeNamePokemon = (event) => {
    pokemonName = event.target.value;
  }
  const handleChangeDetailPokemon = (event) => {
    pokemonDetail = event.target.value;
  }
  const handleChangeEvolutionPokemon = (event) => {
    pokemonEvolution = event.target.value;
  }
  const handleClickEditM = (pokemonId, pokemonName, pokemonDetail) => {
    if(pokemonId !== "" && pokemonName !== "" && pokemonDetail !== "") {
      handleClickEdit(pokemonId, pokemonName, pokemonDetail);
    }else{
      alert('Ingrese datos de nombre y detalles')
    }
  }
  return (
    <div
      className="modal fade"
      id="editpokemodal"
      tabindex="-1"
      aria-labelledby="exampleModalLabel"
      aria-hidden="true"
    >
      <div className="modal-dialog modal-lg modal-dialog-centered">
        <div className="modal-content bg-dark text-light">
          <div className="modal-header">
            <h5 className="modal-title display-4" id="contactoLabel">
              Editando un pokémon...
            </h5>
            <a type="button" data-bs-dismiss="modal" aria-label="Close">
              <span className="fa-layers fa-fw">
                <i className="fas fa-circle colorT"></i>
                <i
                  className="fa-inverse fas fa-times"
                  data-fa-transform="shrink-6"
                ></i>
              </span>
            </a>
          </div>
          <div className="modal-body">
            <div className="container">
                <div className="mb-3">
                  <label for="nombrePokemon" className="col-form-label">
                    Nombre:
                  </label>
                  <input
                    type="text"
                    className="form-control"
                    id="nombrePokemon"
                    onChange={handleChangeNamePokemon}
                    defaultValue={pokemonData.pokemon}
                    required
                  />
                </div>
                <div className="mb-3">
                  <label for="detailsPokemon" className="col-form-label">
                    Detalles:
                  </label>
                  <textarea
                    className="form-control"
                    id="detailsPokemon"
                    onChange={handleChangeDetailPokemon}
                    defaultValue={pokemonData.detail}
                    required
                  ></textarea>
                </div>
                <div className="mb-3">
                  <label for="tipoPokemon" className="col-form-label">
                    Tipo:
                  </label>
                  <select
                    className="form-select"
                    aria-label="Select typo pokemon"
                  >
                    <option selected></option>
                    <option value="1">Planta</option>
                    <option value="2">Fuego</option>
                    <option value="3">Agua</option>
                  </select>
                </div>
                <div className="mb-3">
                  <label for="evolutionPokemon" className="col-form-label">
                    Tiene evolución?
                  </label>
                  <div className="d-flex">
                    <div className="form-check mx-3">
                      <input
                        className="form-check-input"
                        type="radio"
                        name="evolution"
                        id="evolutionId"
                      />
                      <label className="form-check-label" for="evolutionId">
                        Si
                      </label>
                    </div>
                    <div className="form-check mx-3">
                      <input
                        className="form-check-input"
                        type="radio"
                        name="evolution"
                        id="evolutionId"
                        checked
                      />
                      <label className="form-check-label" for="evolutionId">
                        No
                      </label>
                    </div>
                  </div>
                </div>
                <button className="btn btn-outline-primary"
                data-bs-dismiss="modal"
                onClick={() => handleClickEditM(pokemonData.pokemonId, pokemonName, pokemonDetail )}
                >Enviar</button>
            </div>
          </div>
          <div className="modal-footer">
            <button
              type="button"
              className="btn btn-danger"
              data-bs-dismiss="modal"
            >
              Cerrar
            </button>
          </div>
        </div>
      </div>
    </div>
  );
};

export default EditPokemon;
