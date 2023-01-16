package mx.bytebank.test;

import mx.bytebank.modelo.Cliente;
import mx.bytebank.modelo.Cuenta;
import mx.bytebank.modelo.CuentaCorriente;
import java.util.*;

public class TestArrayList {

    public static void main(String[] args) {

        List<Cliente> listaClientes = new ArrayList<Cliente>();
        LinkedList<Cuenta> lista = new LinkedList<>();
        Cuenta cc = new CuentaCorriente(22, 33);
        Cuenta cc2 = new CuentaCorriente(22, 44);
        Cuenta cc4 = new CuentaCorriente(22, 33);

        lista.add(cc);
        lista.add(cc2);

        Cuenta cc3 = (CuentaCorriente) lista.get(0);
        lista.add(cc3);

        boolean contienePorReferencia = lista.contains(cc4);
        System.out.println(contienePorReferencia);



//        for (Cuenta o : lista) {
//            System.out.println(o);
//        }


    }

}
