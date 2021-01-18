import React from "react";

const InfoPokemonModal = ({ pokemonData, handleClickDeletePokemon, handleClickEditPokemon }) => {
  return (
    <div
      className="modal fade"
      id="infopokemodal"
      tabindex="-1"
      aria-labelledby="exampleModalLabel"
      aria-hidden="true"
    >
      <div className="modal-dialog modal-lg modal-dialog-centered">
        <div className="modal-content bg-dark text-light">
          <div className="modal-header">
            <h5 className="modal-title display-4" id="contactoLabel">
              {pokemonData.pokemon}
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
            <div>
              <h7 className="display-1"></h7>
              <p className="lead mb-md-1">{pokemonData.detail}</p>
              <hr className="bg-light" />
            </div>
            <div>
              <h7 className="display-1"></h7>
              <p className="lead mb-md-1">Categoria | Por definir</p>
              <hr className="bg-light" />
            </div>
            <div>
              <h7 className="display-1"></h7>
              <p className="lead mb-md-1">Evolucion | Por definir</p>
              <hr className="bg-light" />
            </div>
          </div>
          <div className="modal-footer">
            <button 
            type="button" 
            className="btn btn-danger" 
            data-bs-dismiss="modal"
            onClick={() => handleClickDeletePokemon(pokemonData.pokemonId)}
            >
              Eliminar
            </button>
            <button 
            type="button" 
            className="btn btn-primary"
            data-bs-dismiss="modal"
            data-bs-toggle="modal"
            data-bs-target="#editpokemodal"
            onClick={() => handleClickEditPokemon(pokemonData)}
            >
              Editar
            </button>
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

export default InfoPokemonModal;
