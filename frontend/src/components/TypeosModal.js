import React from "react";
import img from "../img/poke5.jpg";

const TyposModal = () => {
  return (
    <div
      className="modal fade"
      id="typosmodal"
      tabindex="-1"
      aria-labelledby="exampleModalLabel"
      aria-hidden="true"
    >
      <div className="modal-dialog modal-lg modal-dialog-centered">
        <div className="modal-content bg-dark text-light">
          <div className="modal-header">
            <h5 className="modal-title display-4" id="contactoLabel">
              Tipos de Pokémon
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

              <div className="row">

                <div className="col-12 col-md-4 col-lg-3 mt-3">
                  <a href="#" className="card colorB text-decoration-none">
                    <img src={img} className="card-img-top" alt="..." />
                    <div className="card-body">
                      <h5 className="card-title">Planta</h5>
                      <p className="card-text">
                        Los pokémones tipo planta bla bla bla.
                      </p>
                    </div>
                  </a>
                </div>

                <div className="col-12 col-md-4 col-lg-3 mt-3">
                  <a href="#" className="card colorB text-decoration-none">
                    <img src={img} className="card-img-top" alt="..." />
                    <div className="card-body">
                      <h5 className="card-title">Fuego</h5>
                      <p className="card-text">
                        Los pokémones tipo fuego bla bla bla.
                      </p>
                    </div>
                  </a>
                </div>
                <div className="col-12 col-md-4 col-lg-3 mt-3">
                  <a href="#" className="card colorB text-decoration-none">
                    <img src={img} className="card-img-top" alt="..." />
                    <div className="card-body">
                      <h5 className="card-title">Agua</h5>
                      <p className="card-text">
                        Los pokémones tipo agua bla bla bla.
                      </p>
                    </div>
                  </a>
                </div>
                <div className="col-12 col-md-4 col-lg-3 mt-3">
                  <a href="#" className="card colorB text-decoration-none">
                    <img src={img} className="card-img-top" alt="..." />
                    <div className="card-body">
                      <h5 className="card-title">Metal</h5>
                      <p className="card-text">
                        Los pokémones tipo Metal bla bla bla.
                      </p>
                    </div>
                  </a>
                </div>
                <div className="col-12 col-md-4 col-lg-3 mt-3">
                  <a href="#" className="card colorB text-decoration-none">
                    <img src={img} className="card-img-top" alt="..." />
                    <div className="card-body">
                      <h5 className="card-title">Lucha</h5>
                      <p className="card-text">
                        Los pokémones tipo Lucha bla bla bla.
                      </p>
                    </div>
                  </a>
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

export default TyposModal;
