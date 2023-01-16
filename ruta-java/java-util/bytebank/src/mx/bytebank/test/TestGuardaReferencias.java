package mx.bytebank.test;

import mx.bytebank.modelo.Cuenta;
import mx.bytebank.modelo.CuentaCorriente;
import mx.bytebank.modelo.GuardaReferencias;

public class TestGuardaReferencias {
    public static void main(String[] args) {
        GuardaReferencias guardaReferencias = new GuardaReferencias();
        Cuenta cc = new CuentaCorriente(22, 11);
        Cuenta cc2 = new CuentaCorriente(22, 22);

        guardaReferencias.adicionar(cc);
        guardaReferencias.adicionar(cc2);

        System.out.println(guardaReferencias.obtener(1));
    }
}
