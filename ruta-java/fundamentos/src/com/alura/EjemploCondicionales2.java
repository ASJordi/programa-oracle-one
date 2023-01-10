package com.alura;

public class EjemploCondicionales2 {
    public static void main(String[] args) {

        int edad = 15;
        int cantidadPersonas = 2;
        boolean tienePareja = cantidadPersonas == 2;

        if (edad >= 18 && tienePareja) {
            System.out.println("Puedes entrar.");
        } else {
            System.out.println("No puedes entrar");
        }

    }
}
