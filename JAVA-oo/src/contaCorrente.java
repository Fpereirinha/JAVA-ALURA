public class contaCorrente extends Conta{
    public contaCorrente(double saldo, String agencia, String numero, Pessoa titular) {
        super(saldo, agencia, numero, titular);
    }

    public contaCorrente() {
    }

    public void passaMes() {
        System.out.println("Conta corrente não rende !");
    }
}