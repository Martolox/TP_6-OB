package org.unrn.ejercicio2;

import org.unrn.ejercicio1.ClimaOnline;
import org.unrn.ejercicio1.Medidor;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroEnDisco implements Registro {
    private Medidor medidor;

    public RegistroEnDisco(Medidor medidor) {
        this.medidor = medidor;
    }

    private String getFecha() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.now().format(dtf);
    }

    @Override
    public void actualizar() {
        try {
            FileWriter writer = new FileWriter("src/main/resources/temp.txt");
            writer.write("%s - Temperatura: %d °C".formatted(getFecha(), medidor.getTemperatura()));
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException("Problema al guardar archivo");
        }
    }
}
