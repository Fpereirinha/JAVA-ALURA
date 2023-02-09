package ByteBank.Modelo.Testes;

import ByteBank.Modelo.Pessoa;
import ByteBank.Modelo.contaCorrente;
import ByteBank.Modelo.seguroVida;

public class testeImpostos {
    public static void main(String[] args) {
        contaCorrente cc = new contaCorrente(0,
                "1195",
                "5546",
                new Pessoa("Pedro", "465465", "54645"));
        cc.deposita(100);
        cc.setImposto(.1);
        System.out.println(cc.getImposto());
        cc.passaMes();
        System.out.println(cc.getSaldo());
        seguroVida sv = new seguroVida();


    }
}
