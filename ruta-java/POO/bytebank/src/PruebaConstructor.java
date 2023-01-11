public class PruebaConstructor {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(22);
        Cuenta cuentaDos = new Cuenta(33);
        Cuenta cuentaTres = new Cuenta(44);

        System.out.println(Cuenta.getTotalCuentas());
    }
}
