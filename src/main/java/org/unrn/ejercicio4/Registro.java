package org.unrn.ejercicio4;

public interface Registro {
    void cargarPersona(String nombre, String telefono, String region);

    void notificar(String nombre, String telefono, String region);

    void agregar(Observador observador);
}
