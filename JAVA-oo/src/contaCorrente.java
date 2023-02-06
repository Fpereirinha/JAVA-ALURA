public class contaCorrente extends Conta implements calculaImpostos {
    private final calculaImpostosI imposto;

    public contaCorrente(double saldo, String agencia, String numero, Pessoa titular) {
        super(saldo, agencia, numero, titular);
        this.imposto = new calculaImpostosI();
    }

    public contaCorrente() {
        this.imposto = new calculaImpostosI();
    }


    public double getImposto() {
        return this.imposto.getImposto();
    }


    public void setImposto(double imposto) {
        this.imposto.setImposto(imposto);
    }

    public void passaMes() {
        System.out.println("Conta corrente não rende !");
    }

    @Override
    public boolean saca(double valor) {
        return super.saca(valor + .1);
    }
}
