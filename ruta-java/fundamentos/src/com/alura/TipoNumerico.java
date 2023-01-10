package com.alura;

public class TipoNumerico {
    public static void main(String[] args) {
        //valor int
        int numero = 10;
        numero = 20;

        // valor double
        double salario = 1000.50;
        double salarioEntero = 1000;
        double salarioMitad = salario / 2;

        // conversion tipos de datos (cast)
        double precioDecimal = 230.5;
        int precio = (int) precioDecimal;

        float precioFloat = 2.5F;

        long numeroLargo = 1000000000000000000L;
        short numeroCorto = 1000;
        byte numeroByte = 100;

    }
}