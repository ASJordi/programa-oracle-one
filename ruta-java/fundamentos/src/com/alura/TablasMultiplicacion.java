package com.alura;

public class TablasMultiplicacion {
    public static void main(String[] args) {
        int numero = 5;
        int limite = 10;
        for (int i = 0; i <= limite; i++){
//            System.out.println(numero + " x " + i + " = " + numero * i);
        }

        // Ejemplo 2
        for (int contador = 0; contador <= 10; contador++) {
            for (int multiplicacion = 0; multiplicacion <= 10 ; multiplicacion++) {
                System.out.print(contador * multiplicacion);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
