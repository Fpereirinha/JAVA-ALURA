package Banco.Modelo;

public class Pessoa {
    public Pessoa(String nome, String CPF, String profissao) {
        this.nome = nome;
        this.CPF = CPF;
        this.profissao = profissao;
    }

    public Pessoa() {
    }

    public String nome;
    public String CPF;
    public String profissao;
}
