package org.unrn.ejercicio5.app;

import org.unrn.ejercicio5.tarjetas.Tarjeta;

public class Otra implements Tarjeta {
    public double aplicarDescuento(double mPl, double mBeb) {
        double t = mPl + mBeb;
        return t;
    }
}
