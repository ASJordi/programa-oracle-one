public class TestConexion {

    public static void main(String[] args) throws Exception {

        try (Conexion con = new Conexion()) {
            con.leerDatos();
        } catch (IllegalStateException ex){
            System.out.println("Error en la conexion");
            ex.printStackTrace();
        }

        /* Conexion con = null;

        try{
            con = new Conexion();
            con.leerDatos();
        } catch (IllegalStateException ex) {
            System.out.println("Exception: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            System.out.println("Ejecutando Finally");
            if(con != null){
                con.cerrarConexion();
            }
        }
        */

    }

}
