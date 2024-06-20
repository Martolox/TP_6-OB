package org.unrn.ejercicio2;

import org.unrn.ejercicio1.ClimaOnline;
import org.unrn.ejercicio1.Medidor;

public class RegistroEnConsola implements Registro {
    private Medidor medidor;

    public RegistroEnConsola(Medidor medidor) {
        this.medidor = medidor;
    }

    @Override
    public void actualizar() {
        int temp = medidor.getTemperatura();
        System.out.println("Temperatura: " + temp + " °C");
        if (temp < 12) System.out.println("Hace frio, se encenderá la caldera");
        else if (temp > 17) System.out.println("“Hace calor, se encenderá el aire acondicionado");
    }
}
