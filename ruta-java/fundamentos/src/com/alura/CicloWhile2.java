package com.alura;

public class CicloWhile2 {
    public static void main(String[] args) {

        int i = 0;
        int sumaNumeros = 0;

        while (i <= 10) {
            System.out.println(i);
            sumaNumeros += i;
            i++;
        }
        System.out.println(sumaNumeros);
    }
}
