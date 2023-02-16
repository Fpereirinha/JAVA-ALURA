package ByteBank.Modelo;

import java.io.Serial;
import java.io.Serializable;

public class Pessoa implements Serializable {
    @Serial
    private static final long serialVersionUID = -7107715157510602191L;
    public Pessoa(String nome, String CPF, String profissao) {
        this.nome = nome;
        this.CPF = CPF;
        this.profissao = profissao;
    }

    public Pessoa() {
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

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String nome;
    public String CPF;
    public String profissao;
}
