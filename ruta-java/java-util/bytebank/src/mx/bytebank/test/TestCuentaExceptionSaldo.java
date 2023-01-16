package mx.bytebank.test;

import mx.bytebank.modelo.*;

public class TestCuentaExceptionSaldo {
    public static void main(String[] args) {

        Cuenta cuenta = new CuentaAhorros(123, 456);
        cuenta.depositar(200);
        try {
            cuenta.retirar(210);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }
        System.out.println(cuenta.getSaldo());

    }
}
