public class ConexionPostgres implements Conexion {
    @Override
    public void probarConsulta(String sql) {
        System.out.println("[PostgreSQL] Conectado al servidor. Ejecutando: " + sql);
    }
}
