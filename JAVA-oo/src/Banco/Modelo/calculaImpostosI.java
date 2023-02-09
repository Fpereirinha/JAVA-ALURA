package Banco.Modelo;

public class calculaImpostosI {
    private double imposto;

    public double getTotalImposto(double saldo) {
        return this.imposto * saldo;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

}
