package org.unrn.ejercicio5;

import org.unrn.ejercicio5.registros.RegCobros;

public class MockRegCobros implements RegCobros {
    public String texto;

    public String getTexto() {
        return texto;
    }

    public void guardar(String texto) {
        this.texto = texto;
    }

    public void vaciar(String nomArchivo) {
    }
}
