package Banco.Modelo.Testes;


import Banco.Modelo.Conta;
import Banco.Modelo.Pessoa;
import Banco.Modelo.contaCorrente;

public class testaBanco {
    public static void main(String[] args) {
        Pessoa Paulo = new Pessoa();
        Paulo.nome = "Paulo S.";
        Paulo.CPF = "54546546545";
        Paulo.profissao = "Professor";
        Conta contaDoPaulo = new contaCorrente();
        contaDoPaulo.deposita(100);
        contaDoPaulo.titular = Paulo;
        System.out.println(contaDoPaulo.titular.nome);
    }
}
