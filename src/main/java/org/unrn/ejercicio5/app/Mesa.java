package org.unrn.ejercicio5.app;

import org.unrn.ejercicio5.registros.RegCobros;
import org.unrn.ejercicio5.tarjetas.Tarjeta;

import java.time.LocalDate;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.time.format.DateTimeFormatter.ofLocalizedDate;

public class Mesa {
    private final Map<String, Double> platos = new HashMap<>();
    private final Map<String, Double> bebidas = new HashMap<>();
    private final List<Pedido> pedidos = new ArrayList<>();
    private final RegCobros regCobros;

    public Mesa(RegCobros regCobros) {
        this.regCobros = regCobros;
        CrearMenuConPrecios();
    }

    private void CrearMenuConPrecios() {
        platos.put("Plato1", 10.0);
        platos.put("Plato2", 20.0);
        platos.put("Plato3", 30.0);
        bebidas.put("Bebida1", 1.0);
        bebidas.put("Bebida2", 2.0);
        bebidas.put("Bebida3", 3.0);
    }

    public void crearPedido(String plato, String bebida) {
        pedidos.add(new Pedido(plato, bebida));
    }

    public double cobrar(Tarjeta t, Propina p) {
        double total = calcularPropina(p, t.aplicarDescuento(calcularTotalPlatos(), calcularTotalBebidas()));
        guardarTotal(total);
        return total;
    }

    private void guardarTotal(double total) {
        String texto = LocalDate.now().format(ofLocalizedDate(FormatStyle.SHORT)) +
                "||" + total + "\n";
        regCobros.guardar(texto);
    }

    private double calcularTotalPlatos() {
        double v = 0;
        for (Pedido p : pedidos) {
            v += platos.get(p.getPlato());
        }
        return v;
    }

    private double calcularTotalBebidas() {
        double v = 0;
        for (Pedido p : pedidos) {
            v += bebidas.get(p.getBebida());
        }
        return v;
    }

    private double calcularPropina(Propina p, double t) {
        return switch (p) {
            case DOS -> t + 0.02 * t;
            case TRES -> t + 0.03 * t;
            case CINCO -> t + 0.05 * t;
        };
    }

    public enum Propina {
        DOS,
        TRES,
        CINCO
    }
}
