public class Main {
    public static void main(String[] args) {

        // simulamos que el usuario eligio el motor en la configuracion
        String motorElegido = "POSTGRES";

        // 1. Parte de seleccion (decidimos que fabrica usar)
        FabricaConexion fabrica = obtenerFabrica(motorElegido);

        // 2. Logica de negocio (usa la conexion sin saber cual motor es)
        if (fabrica != null) {
            fabrica.ejecutarPrueba("SELECT * FROM pacientes;");
        }
    }

    // metodo aparte para no mezclar la eleccion con el uso
    private static FabricaConexion obtenerFabrica(String motor) {
        if (motor.equalsIgnoreCase("SQLITE")) {
            return new FabricaSQLite();
        } else if (motor.equalsIgnoreCase("POSTGRES")) {
            return new FabricaPostgres();
        }
        System.out.println("Motor no soportado.");
        return null;
    }
}