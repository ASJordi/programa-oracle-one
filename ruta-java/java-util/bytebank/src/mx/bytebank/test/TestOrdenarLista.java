package mx.bytebank.test;

import mx.bytebank.modelo.Cuenta;
import mx.bytebank.modelo.CuentaAhorros;
import mx.bytebank.modelo.CuentaCorriente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestOrdenarLista {

    public static void main(String[] args) {

        Cuenta cc1 = new CuentaCorriente(22, 33);
        cc1.depositar(333.0);

        Cuenta cc2 = new CuentaAhorros(22, 44);
        cc2.depositar(444.0);

        Cuenta cc3 = new CuentaCorriente(22, 11);
        cc3.depositar(111.0);

        Cuenta cc4 = new CuentaAhorros(22, 22);
        cc4.depositar(222.0);

        List<Cuenta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }

        System.out.println("------------------");
        // Ordenar las cuentas
        // Comparator <? implements Cuenta> comparador
        Comparator<Cuenta> comparator = new OrdenadorPorNumeroCuenta();
        lista.sort(comparator);

        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }
    }
}

class OrdenadorPorNumeroCuenta implements Comparator<Cuenta> {

    @Override
    public int compare(Cuenta c1, Cuenta c2) {
//        if (c1.getNumero() == c2.getNumero()) {
//            return 0;
//        } else if (c1.getNumero() > c2.getNumero()) {
//            return 1;
//        } else {
//            return -1;
//        }
//        return c1.getNumero() - c2.getNumero();
        return Integer.compare(c1.getNumero(), c2.getNumero());
    }
}
