import ByteBank.Modelo.contaCorrente;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
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
    }
}
