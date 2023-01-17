package com.alura;

import com.alura.model.Alumno;
import com.alura.model.Curso;

import java.util.Iterator;

public class Clase17 {

    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Luis Miguel", "123");
        Alumno alumno2 = new Alumno("Pedro Narvaez", "456");
        Alumno alumno3 = new Alumno("Juan Perez", "789");
        Alumno alumno4 = new Alumno("Maria Lopez", "101");
        Alumno alumno5 = new Alumno("Luisa Fernandez", "102");
        Alumno alumno6 = new Alumno("Fernando Lopez", "103");

        Curso curso1 = new Curso("Historia", 90);
        Curso curso2 = new Curso("Algebra", 40);

        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);
        curso1.addAlumno(alumno6);

        //curso1.getAlumnos().forEach(alumno -> System.out.println(alumno.getNombre()));

        Iterator<Alumno> alumnoIterator = curso1.getAlumnos().iterator();
        while(alumnoIterator.hasNext()){
            System.out.println(alumnoIterator.next().getNombre());
        }

    }
}
