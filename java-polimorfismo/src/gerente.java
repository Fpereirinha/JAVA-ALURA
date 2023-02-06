public class gerente extends autenticacaoClass {
    private final double bonificacao = .1;

    public gerente(String nome, String CPF, double salario) {
        super(nome, CPF, salario);
    }

    public gerente() {
    }




    public double getBonificacao() {
        return (super.salario * 1.2);
    }
}
