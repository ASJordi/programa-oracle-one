public class Conexion implements AutoCloseable {

    public Conexion() {
        System.out.println("Abriendo conexion");
        //throw new IllegalStateException("No se puede abrir la conexion");
    }

    public void leerDatos(){
        System.out.println("Leyendo datos");
        throw new IllegalStateException("Error al leer datos");
    }

    public void cerrarConexion(){
        System.out.println("Cerrando conexion");
    }

    @Override
    public void close() throws Exception {
        cerrarConexion();
    }
}
