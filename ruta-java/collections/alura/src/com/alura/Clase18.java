package com.alura;

import com.alura.model.Alumno;
import com.alura.model.Curso;

import javax.swing.text.html.Option;
import java.util.Iterator;
import java.util.Optional;

public class Clase18 {

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

        Optional<Alumno> alumno = curso1.getAlumnos().stream().filter(a -> "123".equalsIgnoreCase(a.getCodigo())).findFirst();

        if(alumno.isPresent()){
            System.out.println(alumno.get());
        }

        Alumno alumnoMap = curso1.getAlumnosMap().get("123");
        System.out.println(alumnoMap);

    }
}
