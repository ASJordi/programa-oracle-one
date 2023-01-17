package com.alura;

import com.alura.model.Curso;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Clase10 {

    public static void main(String[] args) {

        Curso curso1 = new Curso("Historia", 90);
        Curso curso2 = new Curso("Algebra", 40);
        Curso curso3 = new Curso("Ingles", 60);
        Curso curso4 = new Curso("Geografia", 50);
        Curso curso5 = new Curso("Fisica", 100);
        Curso curso6 = new Curso("Quimica", 80);
        Curso curso7 = new Curso("Programacion", 30);
        Curso curso8 = new Curso("Programacion", 70);

        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        cursos.add(curso5);
        cursos.add(curso6);
        cursos.add(curso7);
        cursos.add(curso8);

        int sumaTotalTiempo = cursos.stream().mapToInt(Curso::getTiempo).sum();
        int numeroMaximo = cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt();
        int numeroMinimo = cursos.stream().mapToInt(Curso::getTiempo).min().getAsInt();
        int sumaTiempoConFiltro = cursos.stream().filter(c -> !c.getNombre().equalsIgnoreCase("Historia")).mapToInt(Curso::getTiempo).sum();
        double promedioTiempo = cursos.stream().mapToInt(Curso::getTiempo).average().getAsDouble();

        Map<String, List<Curso>> cursosAgrupados = cursos.stream().collect(Collectors.groupingBy(Curso::getNombre));

        cursosAgrupados.forEach((key, value) -> System.out.println(key + " - " + value.size()));

        int sumaTiempo = cursos.parallelStream().mapToInt(Curso::getTiempo).sum();

    }
}
