package org.unrn.ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClima {
    @Test
    public void medidorPideTemperatura() {
        WeatherChannelService wcs = new WeatherChannelService();
        Medidor medidor = new Medidor(wcs);
        assertEquals(11, medidor.leerTemperatura());
    }
}
