public class Conta {
    double saldo;
    String agencia;
    String numero;
    Pessoa titular;
    public void deposita(double valor){
        this.saldo += valor;
    }
    public boolean saca (double valor){
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
    void transfere(Conta conta, double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            conta.deposita(valor);
        }
    }
}
