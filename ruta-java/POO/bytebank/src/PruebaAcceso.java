public class PruebaAcceso {
    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta(1);
//        cuenta.setAgencia(22);
        cuenta.depositar(300);
        double saldoActual = cuenta.getSaldo();
        System.out.println(saldoActual);
        System.out.println(cuenta.getAgencia());
    }
}
