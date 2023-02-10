import ByteBank.Modelo.*;

public class testeContas {
    public static void main(String[] args) {
        guardaContas guarda = new guardaContas();
        Conta cc = new contaCorrente();
        guarda.adiciona(cc);
        Conta cp = new contaPoupanca();
        guarda.adiciona(cp);
        int tamanho = guarda.getQtd();
        System.out.println(tamanho);
    }
}
