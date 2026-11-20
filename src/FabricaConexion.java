public abstract class FabricaConexion {

    // este metodo lo van a implementar las fabricas hijas
    public abstract Conexion crearConexion();

    public void ejecutarPrueba(String consulta) {
        Conexion con = crearConexion();
        con.probarConsulta(consulta);
    }
}