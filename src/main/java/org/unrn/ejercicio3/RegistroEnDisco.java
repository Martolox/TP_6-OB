package org.unrn.ejercicio3;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroEnDisco implements ClimaOnline {
    private ClimaOnline clima;

    public RegistroEnDisco(ClimaOnline clima) {
        this.clima = clima;
    }

    private String getFecha() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.now().format(dtf);
    }

    @Override
    public int temperatura() {
        int temp = clima.temperatura();
        try {
            FileWriter writer = new FileWriter("src/main/resources/temp.txt");
            writer.write("%s - Temperatura: %d °C".formatted(getFecha(), temp));
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException("Problema al guardar archivo");
        }
        return temp;
    }
}
