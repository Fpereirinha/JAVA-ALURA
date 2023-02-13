import ByteBank.Modelo.contaCorrente;

import java.util.ArrayList;
import java.util.LinkedList;

public class linkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(2);
        lista.add(3);
        System.out.println(lista);
        lista.remove(0);
        System.out.println(lista);
        ArrayList<contaCorrente> lista2 = new ArrayList<>();
        contaCorrente c = new contaCorrente();
        c.setSaldo(222);
        lista2.add(c);
        contaCorrente ref = lista2.get(0);
        System.out.println(ref.toString());
        System.out.println(c);
        String s = "10";
        System.out.println(Integer.parseInt(s));

    }
}
