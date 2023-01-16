package mx.bytebank.test;

import mx.bytebank.modelo.Cuenta;
import mx.bytebank.modelo.CuentaAhorros;
import mx.bytebank.modelo.CuentaCorriente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestLambda {

    public static void main(String[] args) {

        Cuenta cc1 = new CuentaCorriente(22, 33);
        cc1.depositar(333.0);
        cc1.getTitular().setNombre("Sergio");

        Cuenta cc2 = new CuentaAhorros(22, 44);
        cc2.depositar(444.0);
        cc2.getTitular().setNombre("Ana");

        Cuenta cc3 = new CuentaCorriente(22, 11);
        cc3.depositar(111.0);
        cc3.getTitular().setNombre("Mario");

        Cuenta cc4 = new CuentaAhorros(22, 22);
        cc4.depositar(222.0);
        cc4.getTitular().setNombre("Laura");

        List<Cuenta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

//        for (Cuenta cuenta : lista) {
//            System.out.println(cuenta);
//        }

        System.out.println("------------------");

        lista.sort((Cuenta o1, Cuenta o2) -> Integer.compare(o1.getNumero(), o2.getNumero()));

        Collections.sort(lista, (c1, c2) -> c1.getTitular().getNombre().compareTo(c2.getTitular().getNombre()));

//        for (Cuenta cuenta : lista) {
//            System.out.println(cuenta);
//        }

        lista.forEach((cuenta) -> System.out.println(cuenta.getTitular().getNombre()));

    }
}
