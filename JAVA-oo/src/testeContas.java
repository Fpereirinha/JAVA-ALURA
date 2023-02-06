public class testeContas {
    public static void main(String[] args) {
        contaCorrente cc = new contaCorrente();
        cc.setSaldo(1000);
        contaPoupanca cp = new contaPoupanca();
        cp.setSaldo(1000);
        cc.passaMes();
        cp.passaMes();
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

    }
}
