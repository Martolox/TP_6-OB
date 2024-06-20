package org.unrn.ejercicio1;

import org.unrn.ejercicio2.Registro;
import org.unrn.ejercicio2.Sujeto;

import java.util.ArrayList;
import java.util.List;

public class Medidor implements Sujeto {
    private List<Registro> lista;
    private ClimaOnline clima;
    private int temperatura;

    public int getTemperatura() {
        return temperatura;
    }

    public Medidor(ClimaOnline clima) {
        lista = new ArrayList<Registro>();
        this.clima = clima;
    }

    public int leerTemperatura() {
//      leo la temperatura del servicio web
        this.temperatura = this.clima.temperatura();
        notificar();
        return this.temperatura;
    }

    @Override
    public void suscribir(Registro registro) {
        lista.add(registro);
    }

    @Override
    public void notificar() {
        for (Registro reg : lista) {
            reg.actualizar();
        }
    }
}
