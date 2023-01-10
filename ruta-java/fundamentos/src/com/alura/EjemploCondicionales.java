package com.alura;

public class EjemploCondicionales {
    public static void main(String[] args) {

        int edad = 15;
        int cantidadPersonas = 3;

        if (edad >= 18) {
            System.out.println("Puedes entrar.");
        } else {
            if (cantidadPersonas >= 2){
                System.out.println("Puedes entrar con " + cantidadPersonas +" personas");
            } else{
                System.out.println("No puedes entrar");
            }
        }
    }
}
