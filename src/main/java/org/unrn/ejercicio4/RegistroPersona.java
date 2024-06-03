package org.unrn.ejercicio4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RegistroPersona implements Registro {
    private final Connection dbConn;
    private List<Observador> lista;

    public RegistroPersona(Conexion conexion) {
        dbConn = conexion.open();
        lista = new ArrayList<>();
    }

    @Override
    public void cargarPersona(String nombre, String telefono, String region) {

        try (PreparedStatement st = dbConn
                .prepareStatement("insert into participantes(nombre, telefono, region) " +
                        "values(?,?,?)")) {
            st.setString(1, nombre);
            st.setString(2, telefono);
            st.setString(3, region);
            st.executeUpdate();

        } catch (SQLException e1) {
            throw new RuntimeException(e1);
        }
        notificar(nombre, telefono, region);
    }

    @Override
    public void notificar(String nombre, String telefono, String region) {
        for (Observador observador : lista) {
            observador.actualizar(nombre, telefono, region);
        }
    }

    @Override
    public void agregar(Observador observador) {
        lista.add(observador);
    }
}
