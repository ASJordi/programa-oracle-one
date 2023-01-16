package mx.bytebank.test;

import mx.bytebank.modelo.Administrador;
import mx.bytebank.modelo.Gerente;
import mx.bytebank.modelo.SistemaInterno;

public class TestSistemaInterno {
    public static void main(String[] args) {
        SistemaInterno sistema = new SistemaInterno();
        Gerente gerente = new Gerente();
        Administrador admin = new Administrador();

        gerente.setClave("1234");

        sistema.autenticar(gerente);
    }
}
