package ByteBank.Modelo.Testes;


import ByteBank.Modelo.Conta;
import ByteBank.Modelo.Pessoa;
import ByteBank.Modelo.contaCorrente;

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
