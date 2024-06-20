package org.unrn.ejercicio3;

import org.unrn.ejercicio1.ClimaOnline;
import org.unrn.ejercicio1.Medidor;

public class RegistroEnConsola extends Registro {

    public RegistroEnConsola(ClimaOnline clima, Medidor medidor) {
        super(clima, medidor);
    }

    @Override
    public int temperatura() {
        int temp = medidor.getTemperatura();
        System.out.println("Temperatura: " + temp + " °C");
        if (temp < 12) System.out.println("Hace frio, se encenderá la caldera");
        else if (temp > 17) System.out.println("“Hace calor, se encenderá el aire acondicionado");
        return temp;
    }
}
