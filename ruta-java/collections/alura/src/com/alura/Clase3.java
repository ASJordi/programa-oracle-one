package com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Clase3 {
    public static void main(String[] args) {

        String curso1 = "Geométria";
        String curso2 = "Algebra";
        String curso3 = "Trigonometría";
        String curso4 = "Cálculo";

        ArrayList<String> cursos = new ArrayList<String>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        System.out.println(cursos);

        //Collections.sort(cursos);
        //Collections.sort(cursos, Collections.reverseOrder());

        //cursos.sort(Comparator.naturalOrder());
        //cursos.sort(Comparator.reverseOrder());

        List<String> cursosList = cursos.stream().sorted().collect(Collectors.toList());

        System.out.println(cursosList);
    }
}
