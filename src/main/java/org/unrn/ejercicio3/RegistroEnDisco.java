package org.unrn.ejercicio3;

import org.unrn.ejercicio1.ClimaOnline;
import org.unrn.ejercicio1.Medidor;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroEnDisco extends Registro {

    public RegistroEnDisco(ClimaOnline clima, Medidor medidor) {
        super(clima, medidor);
    }

    private String getFecha() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.now().format(dtf);
    }

    @Override
    public int temperatura() {
        int temp = medidor.getTemperatura();
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
