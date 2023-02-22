package br.com.alura;

import br.com.alura.Aula;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteListaAula {
    public static void main(String[] args) {
        Aula a1 = new Aula("Revisando os arrays", 11);
        Aula a2 = new Aula("Listas de objetos", 25);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 12);
        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        System.out.println(aulas);
        Collections.sort(aulas);
        System.out.println(aulas);
        Collections.sort(aulas, Comparator.comparing(Aula::getTitulo));
        System.out.println(aulas);
    }
}
