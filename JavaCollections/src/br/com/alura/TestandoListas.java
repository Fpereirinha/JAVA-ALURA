package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {
        ArrayList<String> aulas = new ArrayList<>();
        String aula1 = "conhecendo mais de listas";
        String aula2 = "modelando a classe aula";
        String aula3 = "trabalhando com cursos e sets";

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        aulas.add("aumentando oi");
        System.out.println(aulas);
        aulas.remove(0);
        System.out.println(aulas);
        for (String item:
             aulas) {
            System.out.printf("Aula: %s\n", item);
        }
        aulas.forEach(System.out::println);
        Collections.sort(aulas);
        System.out.println(aulas);

    }
}
