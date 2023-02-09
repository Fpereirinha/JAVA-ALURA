package ByteBank.Modelo;

public abstract class Conta {
    protected double saldo;
    String agencia;
    String numero;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public Conta(double saldo, String agencia, String numero, Pessoa titular) {
        total++;
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

    public Conta() {
        total++;

    }

    public Pessoa titular;
    private static int total;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) throws minhaExcecao {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            throw new minhaExcecao("Saldo insuficiente");
        }
    }

    public void transfere(Conta conta, double valor) throws minhaExcecao {

        this.saca(valor);
        conta.deposita(valor);

    }
    //Getter

    public double getSaldo() {
        return this.saldo;
    }

    //Setter
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public static int getTotal() {
        return total;
    }

}
