public class PruebaEncapsulamiento {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1);
        Cliente cliente = new Cliente();
        cliente.setNombre("Diego");
        cliente.setDocumento("12345678");

        cuenta.setTitular(cliente);

        System.out.println(cuenta.getTitular().getNombre());
    }
}
