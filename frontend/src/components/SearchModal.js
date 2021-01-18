import React from "react";

const SearchModal = ({ pokemonInfo, handleClickPokemon, setSearchedPokemon }) => {

  let searchPokemon = '';

  const handleChangeSearch = (event) => {
    searchPokemon = event.target.value;
  }

  const handleSearchM = () => {
    pokemonInfo.map((pokemon) => {
      if(pokemon.pokemon === searchPokemon){
        setSearchedPokemon(pokemon);
      }
    });
  }

  return (
    <div
      className="modal fade"
      id="searchmodal"
      tabindex="-1"
      aria-labelledby="exampleModalLabel"
      aria-hidden="true"
    >
      <div className="modal-dialog modal-lg modal-dialog-centered">
        <div className="modal-content bg-dark text-light">
          <div className="modal-header">
            <h5 className="modal-title display-4" id="contactoLabel">
              Busca a tu amigo pokémon
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
            <div className="row">
              <div className="col-md-12 mb-3 mb-0">
                  <div className="mb-3 d-flex">
                    <input type="text" className="form-control" onChange={handleChangeSearch} />
                    <button className="btn btn-outline-light ms-1"
                    onClick={() => handleSearchM()}
                    >
                      <i className="fas fa-search"></i>
                    </button>
                  </div>
              </div>
              <div className="col-md-12 mb-3 mb-0">
                <div class="list-group">
                  {pokemonInfo.map((pokemon, idx) => {
                    return (
                      <li
                        key={idx}
                        className="list-group-item list-group-item-action cursor"
                        aria-current="true"
                        data-bs-toggle="modal"
                        data-bs-target="#infopokemodal"
                        onClick={() => handleClickPokemon(pokemon)}
                      >
                        {pokemon.pokemon}
                      </li>
                    );
                  })}
                </div>
              </div>
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

export default SearchModal;
