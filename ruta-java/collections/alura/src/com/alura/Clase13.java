package com.alura;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Clase13 {

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

        //listaAlumnos.forEach(alumno -> System.out.println(alumno));

        boolean existeAlumno = listaAlumnos.contains("Luis Miguel");
        String nombreMasLargo = listaAlumnos.stream().max(Comparator.comparing(String::length)).get();
        listaAlumnos.removeIf(alumno -> alumno.length() < 10);
        System.out.println(nombreMasLargo);
    }
}
