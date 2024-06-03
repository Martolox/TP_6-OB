package org.unrn.ejercicio4;

public class Main {
    //Conexión para DB cliente / servidor
    //private static final String URL = "jdbc:derby://localhost:1527/participantes";
    //Conexión para DB en memoria
    public static final String URL = "jdbc:derby:memory:participantes;create=true";
    private static final String USER = "app";
    private static final String PWD = "app";

    public static void main(String[] args) {
        setupBD();
        lanzarAplicacion();
    }

    private static void setupBD() {
        var jdbc = new SetupBD(URL, USER, PWD);
        jdbc.inicializar();
    }

    private static void lanzarAplicacion() {
        javax.swing.SwingUtilities.invokeLater(() -> {
            try {
                Conexion conexion = new Conexion(URL, USER, PWD);
                EmisorMail emisor = new EmisorMail();
                RegistroPersona registro = new RegistroPersona(conexion);
                registro.agregar(emisor);
                
                Modelo modelo = new Modelo(registro);

                new UI(modelo);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }
}