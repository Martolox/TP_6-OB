package org.unrn.ejercicio1;

import org.unrn.ejercicio2.Registro;

public interface ClimaOnline {

    void suscribir(Registro registro);

    void notificar();

    int temperatura();
}

