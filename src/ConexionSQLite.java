public class ConexionSQLite implements Conexion {
    @Override
    public void probarConsulta(String sql) {
        System.out.println("[SQLite] Conectado al archivo local. Ejecutando: " + sql);
    }
}
