package mx.bytebank.test;

import mx.bytebank.modelo.Cliente;
import mx.bytebank.modelo.Cuenta;
import mx.bytebank.modelo.CuentaAhorros;
import mx.bytebank.modelo.CuentaCorriente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestOrdenarLista2 {

    public static void main(String[] args) {

        Cuenta cc1 = new CuentaCorriente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNombre("Diego");
        cc1.setTitular(clienteCC1);
        cc1.depositar(333.0);

        Cuenta cc2 = new CuentaAhorros(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNombre("Renato");
        cc2.setTitular(clienteCC2);
        cc2.depositar(444.0);

        Cuenta cc3 = new CuentaCorriente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNombre("Liam");
        cc3.setTitular(clienteCC3);
        cc3.depositar(111.0);

        Cuenta cc4 = new CuentaAhorros(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNombre("Noel");
        cc4.setTitular(clienteCC4);
        cc4.depositar(222.0);

        List<Cuenta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        for (Cuenta cuenta : lista) {
            System.out.println(cuenta.getTitular().getNombre());
        }

        System.out.println("------------------");
        Comparator<Cuenta> comparator = new OrdenadorPorNombreTitular();
        // lista.sort(comparator);
        // lista.sort(new OrdenadorPorNombreTitular());

        lista.sort(new Comparator<Cuenta>() {
            @Override
            public int compare(Cuenta c1, Cuenta c2) {
                return c1.getTitular().getNombre().compareTo(c2.getTitular().getNombre());
            }
        });

        for (Cuenta cuenta : lista) {
            System.out.println(cuenta.getTitular().getNombre());
        }
    }
}

class OrdenadorPorNombreTitular implements Comparator<Cuenta> {

    @Override
    public int compare(Cuenta c1, Cuenta c2) {
        return c1.getTitular().getNombre().compareTo(c2.getTitular().getNombre());
    }

}
