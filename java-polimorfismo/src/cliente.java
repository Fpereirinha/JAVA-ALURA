public class cliente implements autenticacao {
    private autenticacaoI base;
    public cliente(){
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
}
