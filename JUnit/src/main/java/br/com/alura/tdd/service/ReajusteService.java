package main.java.br.com.alura.tdd.service;

import main.java.br.com.alura.tdd.modelo.Desempenho;
import main.java.br.com.alura.tdd.modelo.Funcionario;

import java.math.RoundingMode;

public class ReajusteService {
    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {

        funcionario.setSalario(funcionario.getSalario().multiply(desempenho.percentualReajuste()).setScale(2, RoundingMode.HALF_UP));

    }
}
