package mx.bytebank.test;

import mx.bytebank.modelo.Contador;
import mx.bytebank.modelo.Funcionario;

public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario diego = new Contador();
        diego.setNombre("Diego");
        diego.setDocumento("1");
        diego.setSalario(2000);
        diego.setTipo(0);

        System.out.println(diego.getBonificacion());
    }
}
