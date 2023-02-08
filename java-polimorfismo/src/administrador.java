public class administrador extends funcionario implements autenticacao {

    private final autenticacaoI base;

    public administrador() {
        this.base = new autenticacaoI();
    }

    @Override
    public void setSenha(int senha) {
        this.base.setSenha(senha);

    }

    @Override
    public boolean autentica(int senha) {
        return this.base.autentica(senha);
    }

    public double getBonificacao() {
        return 1;
    }


}

