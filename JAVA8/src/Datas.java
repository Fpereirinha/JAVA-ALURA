import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        System.out.println(hoje);
        LocalDate olimpiadas = LocalDate.of(2016, Month.JUNE, 5);
        int anos = olimpiadas.getYear() - hoje.getYear();
        System.out.println(anos);
        Period periodo = Period.between(hoje, olimpiadas);
        System.out.println(periodo);
        System.out.println(olimpiadas);
        LocalDate Proximas = olimpiadas.plusYears(4);
        System.out.println(Proximas);
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatadorhoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        String valorFormatado = Proximas.format(formatador);
        System.out.println(valorFormatado);
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorhoras));
    }
}
