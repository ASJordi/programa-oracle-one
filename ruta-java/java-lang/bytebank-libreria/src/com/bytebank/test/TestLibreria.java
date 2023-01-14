package com.bytebank.test;


import mx.bytebank.modelo.Cuenta;
import mx.bytebank.modelo.CuentaCorriente;

public class TestLibreria {
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaCorriente(1, 1);
        cuenta.depositar(2000);
        System.out.println("Saldo actual: " + cuenta.getSaldo());;
    }
}
