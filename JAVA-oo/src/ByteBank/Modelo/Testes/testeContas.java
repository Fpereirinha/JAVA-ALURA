package ByteBank.Modelo.Testes;


import ByteBank.Modelo.contaCorrente;
import ByteBank.Modelo.contaPoupanca;
import ByteBank.Modelo.minhaExcecao;

public class testeContas {
    public static void main(String[] args) throws minhaExcecao {
        contaCorrente cc = new contaCorrente();
        cc.setSaldo(1000);
        contaPoupanca cp = new contaPoupanca();
        cp.setSaldo(1000);
        cc.passaMes();
        cp.passaMes();
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
        cp.transfere(cc, 500);
        System.out.println(cc.getSaldo() + " " + cp.getSaldo());
        cc.saca(10);
        System.out.println(cc.getSaldo());
    }
}
