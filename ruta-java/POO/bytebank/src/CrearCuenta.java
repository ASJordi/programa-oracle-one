public class CrearCuenta {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta(1);
//        primeraCuenta.saldo = 200;

        Cuenta segundaCuenta = new Cuenta(2);
//        segundaCuenta.saldo = 50;

        if (primeraCuenta != segundaCuenta) {
            System.out.println("a");
        }
    }
}
