package org.unrn.ejercicio3;

import org.unrn.ejercicio1.ClimaOnline;
import org.unrn.ejercicio1.Medidor;

public abstract class Registro extends Medidor {
    protected Medidor medidor;

    public Registro(ClimaOnline clima, Medidor medidor) {
        super(clima);
        this.medidor = medidor;
    }

    public abstract int temperatura();
}
