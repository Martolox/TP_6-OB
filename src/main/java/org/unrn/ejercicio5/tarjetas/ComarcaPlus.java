package org.unrn.ejercicio5.tarjetas;

public class ComarcaPlus implements Tarjeta {
    public double aplicarDescuento(double mPl, double mBeb) {
        double t = mPl + mBeb - 0.02 * (mPl + mBeb);
        return t;
    }
}
