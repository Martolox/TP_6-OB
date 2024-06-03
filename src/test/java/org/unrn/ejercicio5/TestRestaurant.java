package org.unrn.ejercicio5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.unrn.ejercicio5.app.Mesa;
import org.unrn.ejercicio5.app.Otra;
import org.unrn.ejercicio5.tarjetas.ComarcaPlus;
import org.unrn.ejercicio5.tarjetas.Mastercard;
import org.unrn.ejercicio5.tarjetas.Visa;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRestaurant {
    Mesa mesa;
    MockRegCobros regCobros = new MockRegCobros();

    public void borrarArchivo() {
        regCobros.vaciar("output.txt");
    }

    @BeforeEach
    public void seCreaMesaConPedidos() {
        borrarArchivo();
        mesa = new Mesa(regCobros);
        mesa.crearPedido("Plato1", "Bebida1");
        mesa.crearPedido("Plato2", "Bebida2");
        mesa.crearPedido("Plato3", "Bebida3");
        mesa.crearPedido("Plato1", "Bebida3");
    }

    @Test
    public void sePagaConVisa() {
        Visa visa = new Visa();
        assertEquals(80.3046,
                mesa.cobrar(visa, Mesa.Propina.DOS),
                0.001);
    }

    @Test
    public void sePagaConMastercard() {
        Mastercard mastercard = new Mastercard();
        assertEquals(79.928,
                mesa.cobrar(mastercard, Mesa.Propina.TRES),
                0.001);
    }

    @Test
    public void sePagaConComarcaPlus() {
        ComarcaPlus comarcaplus = new ComarcaPlus();
        assertEquals(81.291,
                mesa.cobrar(comarcaplus, Mesa.Propina.CINCO),
                0.001);
    }

    @Test
    public void sePagaConOtra() {
        Otra viedma = new Otra();
        assertEquals(82.95,
                mesa.cobrar(viedma, Mesa.Propina.CINCO),
                0.001);
    }
}
