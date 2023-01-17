package com.alura;

import java.util.ArrayList;

public class Clase2 {
    public static void main(String[] args) {

        String variable1 = "Clase 1";
        String variable2 = "Clase 2";
        String variable3 = "Clase 3";
        String variable4 = "Clase 4";

        ArrayList<String> lista = new ArrayList<String>();
        lista.add(variable1);
        lista.add(variable2);
        lista.add(variable3);
        lista.add(variable4);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        for (String elemento : lista) {
            System.out.println(elemento);
        }

        lista.forEach(clase -> System.out.println(clase));
    }
}
