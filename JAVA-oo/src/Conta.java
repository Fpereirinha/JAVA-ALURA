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

    Pessoa titular;
    private static int total;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    void transfere(Conta conta, double valor) {
        if (this.saldo >= valor && valor > 0) {
            this.saldo -= valor;
            conta.deposita(valor);
        }
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
