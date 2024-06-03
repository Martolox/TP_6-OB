package org.unrn.ejercicio2;

import org.junit.jupiter.api.Test;
import org.unrn.ejercicio1.WeatherChannelService;

public class TestClima2 {

    @Test
    public void seActualizaElClima() {
        WeatherChannelService wcs = new WeatherChannelService();
        RegistroEnConsola regConsola = new RegistroEnConsola(wcs);
        RegistroEnDisco regDisco = new RegistroEnDisco(wcs);
        wcs.suscribir(regConsola);
        wcs.suscribir(regDisco);
        wcs.notificar();
    }
}
