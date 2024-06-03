package org.unrn.ejercicio4;

public class Modelo {
    Registro reg;

    public Modelo(Registro reg) {
        this.reg = reg;
    }

    public void cargarPersona(String nombre, String telefono, String region) {
        reg.cargarPersona(nombre, telefono.replace("-", ""), region);
    }
}
