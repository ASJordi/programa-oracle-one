package com.alura;

public class EjemploValorVariable {
    public static void main(String[] args) {
        int numeroUno = 5;
        int numeroDos = 9;

        System.out.println(numeroDos);

        numeroDos = numeroUno;
        System.out.println(numeroDos);

        numeroUno = 88;
        System.out.println(numeroDos);
    }
}
