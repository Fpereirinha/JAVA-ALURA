public class cliente implements autenticacao {
    private int senha;

    @Override
    public void setSenha(int senha) {
        this.senha = senha;

    }

    @Override
    public boolean autentica(int senha) {
        return senha == this.senha;
    }
}
