package org.unrn.ejercicio1;

public class Medidor {
    private int temperatura;
    private ClimaOnline clima;

    public Medidor(ClimaOnline clima) {
        this.clima = clima;
    }

    public int leerTemperatura() {
//      leo la temperatura del servicio web
        this.temperatura = this.clima.temperatura();
        return this.temperatura;
    }
}
