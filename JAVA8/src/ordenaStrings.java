import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ordenaStrings {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("Caelumoooooo");
        palavras.add("Pedro");
        palavras.add("Pauloooo");
        //palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        palavras.sort(Comparator.comparing(String::length));
        palavras.sort(Comparator.comparingInt(String::length));
        System.out.println(palavras);
        Collections.sort(palavras, new lenComparable());
        System.out.println(palavras);
        palavras.forEach(System.out::println);


    }
}

class lenComparable implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
