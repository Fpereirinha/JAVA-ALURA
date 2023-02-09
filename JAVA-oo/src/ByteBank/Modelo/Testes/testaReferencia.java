package ByteBank.Modelo.Testes;

import ByteBank.Modelo.Conta;
import ByteBank.Modelo.contaCorrente;

public class testaReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new contaCorrente();
        System.out.println(primeiraConta.getSaldo());

        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new contaCorrente();

        System.out.println("primeira conta tem " + primeiraConta.getSaldo());
        System.out.println("segunda conta tem " + segundaConta.getSaldo());

        segundaConta.setAgencia("146");
        System.out.println(primeiraConta.getAgencia());
        System.out.println(primeiraConta.getAgencia());

        System.out.println(segundaConta.getAgencia());

        segundaConta.setAgencia("146");
        System.out.println("agora a segunda conta está na agencia " + segundaConta.getAgencia());

        if (primeiraConta == segundaConta) {
            System.out.println("mesma conta");
        } else {
            System.out.println("contas diferentes");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
        System.out.println(Conta.getTotal());
    }
}
