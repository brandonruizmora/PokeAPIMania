import React from "react";
import img from "../img/poke7.jpg";

const AboutModal = () => {
  return (
    <div
      className="modal fade"
      id="aboutmodal"
      tabindex="-1"
      aria-labelledby="exampleModalLabel"
      aria-hidden="true"
    >
      <div className="modal-dialog modal-lg modal-dialog-centered">
        <div className="modal-content bg-dark text-light">
          <div className="modal-header">
            <h1 className="modal-title display-4" id="contactoLabel">
              Nosotros
            </h1>
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
              <h2 className="display-1">PokéAPIMania</h2>
              <p className="lead mb-md-3">
              
              </p>
            </div>           
            <div className="col-md-6">
                <img src={img} alt="..." className="img-fluid rounded" />
                <h5 className="fw-light mt-2">The Pokémon </h5>
                <h5 className="fw-light mt-2">Términos de uso | Aviso sobre la privacidad </h5>
                <h5 className="fw-light mt-2">Página de Cookies | Información legal </h5>
                <h5 className="fw-light"> ©2021 Pokémon</h5>
                <h5 className="fw-light mt-2"></h5>
                <h5 className="fw-light mt-2">Brandon Ruiz Morales</h5>
                <h5 className="fw-light mt-2">Juan Alejandro Rendon Lucio</h5>
                <h5 className="fw-light mt-2">Erick Osvaldo Carreon Rivera</h5>
                <h5 className="fw-light mt-2">Tere Griselda Valadez Hernandez</h5>
                <h5 className="fw-light">
                </h5>
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

export default AboutModal;
