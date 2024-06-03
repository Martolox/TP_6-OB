package org.unrn.ejercicio2;

import org.unrn.ejercicio1.ClimaOnline;

public class RegistroEnConsola implements Registro {
    private ClimaOnline clima;

    public RegistroEnConsola(ClimaOnline clima) {
        this.clima = clima;
    }

    @Override
    public void actualizar() {
        int temp = clima.temperatura();
        System.out.println("Temperatura: " + temp + " °C");
        if (temp < 12) System.out.println("Hace frio, se encenderá la caldera");
        else if (temp > 17) System.out.println("“Hace calor, se encenderá el aire acondicionado");
    }
}
