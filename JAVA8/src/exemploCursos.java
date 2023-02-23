import java.util.*;
import java.util.stream.Collectors;

public class exemploCursos {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));
        cursos.sort(Comparator.comparingInt(Curso::getAlunos));
        cursos.sort(Comparator.comparingInt(Curso::getAlunos));
        cursos.stream()
                .filter(c -> c.getAlunos() > 100)
                .forEach(c -> System.out.println(c.getNome()));
        cursos.stream()
                .filter(c -> c.getAlunos() > 100)
                .map(Curso::getAlunos)
                .forEach(System.out::println);
        Optional<Curso> optional = cursos.stream()
                .filter(c -> c.getAlunos() > 100)
                .findAny();
        optional.ifPresent(c -> System.out.println(c.getNome()));
        cursos.stream()
                .filter(c -> c.getAlunos() > 100)
                .findAny()
                .ifPresent(c -> System.out.println(c.getNome()));
        cursos
                .stream()
                .filter(c -> c.getAlunos() > 100)
                .collect(Collectors.toMap(Curso::getNome, Curso::getAlunos)).forEach((curso, aluno) -> System.out.println(curso + " tem " + aluno + "alunos"));
        cursos = cursos.stream()
                .filter(c -> c.getAlunos() > 100)
                .collect(Collectors.toList());
    }
}
class Curso {
    private final String nome;
    private final int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}