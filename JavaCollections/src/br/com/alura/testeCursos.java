package br.com.alura;

public class testeCursos {
    public static void main(String[] args) {
        Curso javaCollections = new Curso("Dominando as coleções", "Paulo silveira");


        javaCollections.Adicionar(new Aula("Trabalhando com listas", 21));

        System.out.println(javaCollections.getAulas());
    }
}
