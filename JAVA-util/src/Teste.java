

import ByteBank.Modelo.Conta;
import ByteBank.Modelo.contaPoupanca;
import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        Conta cc1 = new contaPoupanca();
        cc1.deposita(333.0);

        Conta cc2 = new contaPoupanca();
        cc2.deposita(444.0);

        Conta cc3 = new contaPoupanca();
        cc3.deposita(111.0);

        Conta cc4 = new contaPoupanca();
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

    }

}