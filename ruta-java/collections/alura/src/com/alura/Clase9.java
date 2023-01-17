package com.alura;

import com.alura.model.Curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Clase9 {

    public static void main(String[] args) {

        Curso curso1 = new Curso("Historia", 30);
        Curso curso2 = new Curso("Algebra", 40);
        Curso curso3 = new Curso("Ingles", 50);
        Curso curso4 = new Curso("Geografia", 60);

        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        int sumaTiempo = cursos.stream().mapToInt(Curso::getTiempo).sum();
        int numeroMaximo = cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt();

        System.out.println(numeroMaximo);
    }
}
