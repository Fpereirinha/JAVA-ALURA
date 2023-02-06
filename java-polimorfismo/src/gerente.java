public class gerente extends funcionario {
    private int senha;
    private final double bonificacao = .1;

    public gerente(String nome, String CPF, double salario) {
        super(nome, CPF, salario);
    }

    public gerente() {
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        return this.senha == senha;
    }

    public double getBonificacao() {
        return (super.salario * 1.2);
    }
}
