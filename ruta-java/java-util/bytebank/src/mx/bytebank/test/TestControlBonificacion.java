package mx.bytebank.test;

import mx.bytebank.modelo.*;

public class TestControlBonificacion {
    public static void main(String[] args) {
        Funcionario diego = new Contador();
        diego.setSalario(2000);

        Gerente jimena = new Gerente();
        jimena.setSalario(10000);

        Contador alexis = new Contador();
        alexis.setSalario(5000);

        ControlBonificacion control = new ControlBonificacion();
        control.registrarSalario(diego);
        control.registrarSalario(jimena);
        control.registrarSalario(alexis);

        System.out.println(control.getSumaBonificaciones());
    }
}
