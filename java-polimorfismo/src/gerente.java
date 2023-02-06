public class gerente extends funcionario implements autenticacao {
    private final double bonificacao = .1;
    private int senha;

    public gerente(String nome, String CPF, double salario) {
        super(nome, CPF, salario);
    }

    public gerente() {
    }


    public double getBonificacao() {
        return (super.salario * 1.2);
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        return this.senha == senha;
    }
}
