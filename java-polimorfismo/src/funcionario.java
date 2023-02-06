public abstract class funcionario {
    private String nome;
    private String CPF;
    protected double salario;


    public abstract double getBonificacao();


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
