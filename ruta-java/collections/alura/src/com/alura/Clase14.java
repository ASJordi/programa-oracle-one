package com.alura;

import com.alura.model.Alumno;

import java.util.*;

public class Clase14 {

    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Luis Miguel", "123");
        Alumno alumno2 = new Alumno("Pedro Narvaez", "456");
        Alumno alumno3 = new Alumno("Juan Perez", "789");
        Alumno alumno4 = new Alumno("Maria Lopez", "101");
        Alumno alumno5 = new Alumno("Luisa Fernandez", "102");
        Alumno alumno6 = new Alumno("Fernando Lopez", "103");

        Collection<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);

        Alumno alumnoNuevo = new Alumno("Luis Miguel", "123");

        System.out.println(alumno1.equals(alumnoNuevo));
        System.out.println(listaAlumnos.contains(alumnoNuevo));

    }
}
