package Banco.Modelo.Testes;

import Banco.Modelo.Conta;
import Banco.Modelo.contaCorrente;
import Banco.Modelo.minhaExcecao;

public class testaMetodo {
    public static void main(String[] args) throws minhaExcecao {
        Conta Pedro = new contaCorrente();
        System.out.println(Pedro.getSaldo());
        Pedro.deposita(100);
        System.out.println(Pedro.getSaldo());
        Pedro.saca(1000);
        System.out.println(Pedro.getSaldo());
        Pedro.saca(50);
        System.out.println(Pedro.getSaldo());
        Conta Gabriel = new contaCorrente();
        Pedro.transfere(Gabriel, 50);
        System.out.println(Pedro.getSaldo());
        System.out.println(Gabriel.getSaldo());
        System.out.println(Pedro.getSaldo());
        Pedro.setNumero("22");
    }
}
