package com.alura;

import com.alura.model.Curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Clase5 {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Java", 30);
        Curso curso2 = new Curso("Php", 40);
        Curso curso3 = new Curso("JavaScript", 50);
        Curso curso4 = new Curso("Ruby", 60);

        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        //Collections.sort(cursos);
        //Collections.sort(cursos, Collections.reverseOrder());

        //cursos.sort(Comparator.comparing(Curso::getNombre));
        //cursos.sort(Comparator.comparing(Curso::getNombre).reversed());

        List<Curso> cursosLista = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());

        System.out.println(cursosLista);
    }
}
