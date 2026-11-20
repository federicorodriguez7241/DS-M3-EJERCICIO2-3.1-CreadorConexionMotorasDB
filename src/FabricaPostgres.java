public class FabricaPostgres extends FabricaConexion {
    @Override
    public Conexion crearConexion() {
        return new ConexionPostgres();
    }
}