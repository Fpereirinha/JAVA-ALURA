public class gerente extends funcionario implements autenticacao {
    private final double bonificacao = .1;
    private final autenticacaoI base;

    public gerente(String nome, String CPF, double salario) {
        super(nome, CPF, salario);
        this.base = new autenticacaoI();
    }

    public gerente() {
        this.base = new autenticacaoI();
    }


    public double getBonificacao() {
        return (super.salario * 1.2);
    }

    @Override
    public void setSenha(int senha) {
        this.base.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.base.autentica(senha);
    }
}
