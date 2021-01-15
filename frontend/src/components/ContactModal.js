import React from "react";
import img from "../img/poke1.png";

const ContactModal = () => {
  return (
    <div
      className="modal fade"
      id="contactmodal"
      tabindex="-1"
      aria-labelledby="exampleModalLabel"
      aria-hidden="true"
    >
      <div className="modal-dialog modal-lg modal-dialog-centered">
        <div className="modal-content bg-dark text-light">
          <div className="modal-header">
            <h5 className="modal-title display-4" id="contactoLabel">
              Contactanos
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
              <div className="col-md-6 mb-3 mb-0">
                <form>
                  <div className="mb-3">
                    <label for="email" className="col-form-label">
                      Email:
                    </label>
                    <input type="text" className="form-control" id="email" />
                  </div>
                  <div className="mb-3">
                    <label for="mensaje" className="col-form-label">
                      Mensaje:
                    </label>
                    <textarea className="form-control" id="mensaje"></textarea>
                  </div>
                  <button className="btn btn-outline-primary">Enviar</button>
                </form>
              </div>
              <div className="col-md-6">
                <img src={img} alt="..." className="img-fluid rounded" />
                <h5 className="fw-light mt-2">Teléfono: 555 555 5555</h5>
                <h5 className="fw-light">Email: mail@dominio.com</h5>
                <h5 className="fw-light">
                  Dirección: Av. Calle #555, isla internet.
                </h5>
                <h5 className="fw-light">
                  <a
                    href="#"
                    className="text-light fst-normal mx-1"
                    target="_blank"
                    rel="noopener noreferrer"
                  >
                    <i className="fab fa-twitter"></i>
                  </a>
                  <a
                    href="#"
                    className="text-light fst-normal mx-1"
                    target="_blank"
                    rel="noopener noreferrer"
                  >
                    <i className="fab fa-facebook"></i>
                  </a>
                  <a
                    href="#"
                    className="text-light fst-normal mx-1"
                    target="_blank"
                    rel="noopener noreferrer"
                  >
                    <i className="fab fa-instagram"></i>
                  </a>
                </h5>
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

export default ContactModal;
