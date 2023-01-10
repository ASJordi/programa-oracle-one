package com.alura;

public class EjemploScope {
    public static void main(String[] args) {

        int edad = 17;
        int cantidadPersonas = 2;
        boolean tienePareja;

        if(cantidadPersonas > 1) {
            tienePareja = true;
        } else{
            tienePareja = false;
        }

        if (edad >= 18 && tienePareja) {
            System.out.println("Puedes entrar.");
        } else {
            System.out.println("No puedes entrar");
        }

    }
}
