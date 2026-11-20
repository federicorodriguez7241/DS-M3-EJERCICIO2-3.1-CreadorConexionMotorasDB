public class FabricaSQLite extends FabricaConexion {
    @Override
    public Conexion crearConexion() {
        return new ConexionSQLite();
    }
}