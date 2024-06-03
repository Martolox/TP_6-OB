package org.unrn.ejercicio3;

import java.util.Random;

public class WeatherChannelService implements ClimaOnline {
    @Override
    public int temperatura() {
        return new Random().nextInt(100);
    }

}
