package org.unrn.ejercicio3;

public class RegistroEnConsola implements ClimaOnline {
    private ClimaOnline clima;

    public RegistroEnConsola(ClimaOnline clima) {
        this.clima = clima;
    }

    @Override
    public int temperatura() {
        int temp = clima.temperatura();
        System.out.println("Temperatura: " + temp + " °C");
        if (temp < 12) System.out.println("Hace frio, se encenderá la caldera");
        else if (temp > 17) System.out.println("“Hace calor, se encenderá el aire acondicionado");
        return temp;
    }
}
