package org.unrn.ejercicio3;

import org.junit.jupiter.api.Test;
import org.unrn.ejercicio1.Medidor;
import org.unrn.ejercicio1.WeatherChannelService;

public class TestClima3 {
    @Test
    public void seDecoraMedidorParaRegistrarEnDiscoYConsola() {
        WeatherChannelService wcs = new WeatherChannelService();
        Medidor medidor = new Medidor(wcs);
        RegistroEnConsola regConsola = new RegistroEnConsola(wcs, medidor);
        RegistroEnDisco regDisco = new RegistroEnDisco(wcs, medidor);

        regConsola.temperatura();
        regDisco.temperatura();
    }
}
