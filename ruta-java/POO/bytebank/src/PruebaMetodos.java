public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta cuentaDiego = new Cuenta(11);
        Cuenta cuentaJimena = new Cuenta(111);


        cuentaDiego.depositar(500);
        cuentaJimena.depositar(1000);

        boolean resultadoRetiro = cuentaDiego.retirar(100);
        if(resultadoRetiro) System.out.println("Retiro exitoso");
        else System.out.println("Saldo insuficiente");

        boolean resultadoTransferencia = cuentaJimena.transferir(500, cuentaDiego);
        if (resultadoTransferencia) System.out.println("Transferencia exitosa");
        else System.out.println("Saldo insuficiente");

    }
}
