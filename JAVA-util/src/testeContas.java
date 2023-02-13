import ByteBank.Modelo.Conta;
import ByteBank.Modelo.contaCorrente;
import ByteBank.Modelo.contaPoupanca;

public class testeContas {
    public static void main(String[] args) {
        guardaContas guarda = new guardaContas();
        Conta cc = new contaCorrente();
        guarda.adiciona(cc);
        Conta cp = new contaPoupanca();
        guarda.adiciona(cp);
        cp.setNumero("22");
        int tamanho = guarda.getQtd();
        System.out.println(tamanho);
        System.out.println(guarda.getReferencia(1).getNumero());
    }
}
