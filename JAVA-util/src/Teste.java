import ByteBank.Modelo.Conta;
import ByteBank.Modelo.contaCorrente;
import ByteBank.Modelo.contaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Teste {

    public static void main(String[] args) {

        Conta cc1 = new contaCorrente();
        cc1.deposita(333.0);

        Conta cc2 = new contaPoupanca();
        cc2.deposita(444.0);

        Conta cc3 = new contaCorrente();
        cc3.deposita(111.0);

        Conta cc4 = new contaPoupanca();
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
        for (Conta conta : lista) {
            System.out.println(conta.getSaldo());
        }

        NumeroDaContaComparator comparator = new NumeroDaContaComparator();

        System.out.println("---------");

        lista.sort(new Comparator<Conta>() {

            @Override
            public int compare(Conta c1, Conta c2) {

                return Double.compare(c1.getSaldo(), c2.getSaldo());
            }
        });

        for (Conta conta : lista) {
            System.out.println(conta.getSaldo());
        }

    }

}

class NumeroDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {

        return Double.compare(c1.getSaldo(), c2.getSaldo());
    }
}