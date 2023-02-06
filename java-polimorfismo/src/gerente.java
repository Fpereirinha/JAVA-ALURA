public class gerente extends funcionario {
    private int senha;

    public gerente(String nome, String CPF, double salario) {
        super(nome, CPF, salario);
    }

    public gerente() {
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else return false;
    }
}
