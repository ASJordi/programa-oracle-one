package mx.bytebank.test;

import mx.bytebank.modelo.Cuenta;
import mx.bytebank.modelo.CuentaAhorros;
import mx.bytebank.modelo.CuentaCorriente;

public class TestArregloReferencias {
    public static void main(String[] args) {

        CuentaCorriente cc = new CuentaCorriente(123, 321);
        CuentaAhorros ca = new CuentaAhorros(123, 421);

        Cuenta[] cuentas = new Cuenta[5];

        cuentas[0] = cc;
        cuentas[1] = new CuentaCorriente(123, 322);
        cuentas[2] = ca;

        CuentaCorriente cuentaDiego = (CuentaCorriente) cuentas[0];
        cuentas[3] = cuentaDiego;

        for (int i = 0; i < cuentas.length; i++) {
            System.out.println(cuentas[i]);
        }

    }
}
