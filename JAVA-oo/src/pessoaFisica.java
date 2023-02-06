public class pessoaFisica {
    private String nome;


    public pessoaFisica(String nome, String id, String CPF) {

        this.nome = nome;
        this.id = id;
        this.CPF = CPF;
    }

    private String id;
    private String CPF;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
