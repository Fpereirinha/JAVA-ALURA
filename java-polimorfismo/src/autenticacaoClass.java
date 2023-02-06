public abstract class autenticacaoClass extends funcionario {
    private int senha;

    public autenticacaoClass(String nome, String CPF, double salario) {
        super(nome, CPF, salario);
    }
    public autenticacaoClass() {
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) return true;
        else return false;
    }
}
