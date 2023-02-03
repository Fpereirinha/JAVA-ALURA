public class Conta {
    double saldo;
    String agencia;
    String numero;
    String titular;
    void deposita(double valor){
        this.saldo += valor;
    }
    void saca (double valor){
        if(valor <= this.saldo){
            this.saldo -= valor;
        }
    }
    void transfere(Conta conta, double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            conta.deposita(valor);
        }
    }
}
