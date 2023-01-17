package com.alura;

import java.util.*;

public class Clase12 {

    public static void main(String[] args) {

        String alumno1 = "Luis Miguel";
        String alumno2 = "Pedro Narvaez";
        String alumno3 = "Juan Perez";
        String alumno4 = "Maria Lopez";
        String alumno5 = "Luisa Fernandez";
        String alumno6 = "Fernando Lopez";

        Set<String> listaAlumnos = new HashSet<>();
        //Collection<String> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);

        //listaAlumnos.forEach(alumno -> System.out.println(alumno));


    }
}
