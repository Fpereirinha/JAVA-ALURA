public class administrador extends funcionario implements autenticacao {

    private int senha;

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        return this.senha == senha;
    }

    public double getBonificacao() {
        return 1;
    }


}

