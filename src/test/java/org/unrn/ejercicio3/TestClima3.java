package org.unrn.ejercicio3;

import org.junit.jupiter.api.Test;

public class TestClima3 {
    @Test
    public void seDecoraWCSParaRegistrarEnDiscoYConsola() {
        WeatherChannelService wcs = new WeatherChannelService();
        RegistroEnConsola regConsola = new RegistroEnConsola(wcs);
        RegistroEnDisco regDisco = new RegistroEnDisco(regConsola);

        regDisco.temperatura();
    }
}
