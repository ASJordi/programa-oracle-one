package com.alura;

import com.alura.model.Curso;

import java.util.ArrayList;
import java.util.List;

public class Clase4 {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Fisica", 30);
        Curso curso2 = new Curso("Matematicas", 40);
        Curso curso3 = new Curso("Quimica", 50);
        Curso curso4 = new Curso("Biologia", 60);

        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        System.out.println(cursos);
    }
}
