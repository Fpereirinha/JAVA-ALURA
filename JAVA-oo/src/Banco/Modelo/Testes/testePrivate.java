package Banco.Modelo.Testes;

import Banco.Modelo.Conta;
import Banco.Modelo.Pessoa;
import Banco.Modelo.contaCorrente;

public class testePrivate {
    public static void main(String[] args) {
        Conta conta = new contaCorrente();
        conta.titular = new Pessoa();
        conta.titular.nome = "Pedro";
        conta.deposita(100);
        System.out.println(conta.getSaldo());
        System.out.println(conta.getClass());

    }
}
