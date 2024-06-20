package org.unrn.ejercicio2;

import org.junit.jupiter.api.Test;
import org.unrn.ejercicio1.Medidor;
import org.unrn.ejercicio1.WeatherChannelService;

public class TestClima2 {

    @Test
    public void seActualizaElClima() {
        Medidor medidor = new Medidor(new WeatherChannelService());
        RegistroEnDisco regDisco = new RegistroEnDisco(medidor);
        RegistroEnConsola regConsola = new RegistroEnConsola(medidor);
        medidor.suscribir(regDisco);
        medidor.suscribir(regConsola);

        medidor.leerTemperatura();
    }
}
