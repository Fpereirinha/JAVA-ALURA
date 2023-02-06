public class contaPoupanca extends Conta{
    public contaPoupanca(double saldo, String agencia, String numero, Pessoa titular) {
        super(saldo, agencia, numero, titular);
    }

    public contaPoupanca() {
    }
    public void passaMes(){
        super.saldo *= 1.1;
    }
}
