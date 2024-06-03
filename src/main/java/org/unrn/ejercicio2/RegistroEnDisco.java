package org.unrn.ejercicio2;

import org.unrn.ejercicio1.ClimaOnline;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroEnDisco implements Registro {
    private ClimaOnline clima;

    public RegistroEnDisco(ClimaOnline clima) {
        this.clima = clima;
    }

    private String getFecha() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.now().format(dtf);
    }

    @Override
    public void actualizar() {
        try {
            FileWriter writer = new FileWriter("src/main/resources/temp.txt");
            writer.write("%s - Temperatura: %d °C".formatted(getFecha(), clima.temperatura()));
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException("Problema al guardar archivo");
        }
    }
}
