package Banco.Modelo.Testes;

import Banco.Modelo.contaCorrente;

public class testeSaca {
    public static void main(String[] args) {
        contaCorrente c = new contaCorrente();
        c.deposita(220);
        try {
            c.saca(321312);
        } catch (Exception x) {
            System.out.println(x);
        }
        System.out.println(c.getSaldo());
    }
}
