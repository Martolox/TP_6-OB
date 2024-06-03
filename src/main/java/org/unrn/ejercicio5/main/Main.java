package org.unrn.ejercicio5.main;

import org.unrn.ejercicio5.app.Mesa;
import org.unrn.ejercicio5.registros.RegCobros;
import org.unrn.ejercicio5.registros.RegEnDisco;
import org.unrn.ejercicio5.tarjetas.Visa;

public class Main {
    public static void main(String[] args) {

        RegCobros regCobros = new RegEnDisco();

        regCobros.vaciar("output.txt");

        Mesa mesa = new Mesa(regCobros);
        mesa.crearPedido("Plato1", "Bebida1");
        mesa.crearPedido("Plato2", "Bebida2");
        mesa.crearPedido("Plato3", "Bebida3");
        mesa.crearPedido("Plato1", "Bebida3");

        Visa visa = new Visa();
    }
}
