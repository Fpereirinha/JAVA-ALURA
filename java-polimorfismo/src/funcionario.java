public abstract class funcionario {
    private String nome;
    private String CPF;
    protected double salario;

    public double getBonificacao(double valor) {
        double salar = this.salario;
        this.salario *= (valor + 1);
        return salar * valor;
    }

    public funcionario(String nome, String CPF, double salario) {
        this.nome = nome;
        this.CPF = CPF;
        this.salario = salario;
    }

    public funcionario() {

    }

    public String getAll() {
        return (this.nome + " " + this.CPF + " " + this.salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
