package com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Clase11 {

    public static void main(String[] args) {

        String alumno1 = "Luis Miguel";
        String alumno2 = "Pedro Narvaez";
        String alumno3 = "Juan Perez";
        String alumno4 = "Maria Lopez";
        String alumno5 = "Luisa Fernandez";
        String alumno6 = "Fernando Lopez";

        Set<String> listaAlumnos = new HashSet<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);

        for (String alumno: listaAlumnos) {
            System.out.println(alumno);
        }

    }
}
