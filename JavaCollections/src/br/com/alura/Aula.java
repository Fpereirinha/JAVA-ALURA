package br.com.alura;

public class Aula implements Comparable<Aula> {

    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return String.format("{Aula: %s ,  duração: %d minutos}", this.titulo, this.tempo);
    }


    @Override
    public int compareTo(Aula aula) {
        return this.tempo - aula.tempo;
    }
}
