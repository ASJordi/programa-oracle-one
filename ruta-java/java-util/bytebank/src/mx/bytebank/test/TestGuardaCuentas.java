package mx.bytebank.test;

import mx.bytebank.modelo.Cuenta;
import mx.bytebank.modelo.CuentaCorriente;
import mx.bytebank.modelo.GuardaCuentas;

public class TestGuardaCuentas {
    public static void main(String[] args) {

        GuardaCuentas guardaCuentas = new GuardaCuentas();
        Cuenta cc = new CuentaCorriente(22, 11);
        Cuenta cc2 = new CuentaCorriente(22, 22);

        guardaCuentas.adicionar(cc);
        guardaCuentas.adicionar(cc2);

        System.out.println(guardaCuentas.obtener(1));
    }
}
