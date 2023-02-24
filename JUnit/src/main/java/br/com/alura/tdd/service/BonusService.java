package main.java.br.com.alura.tdd.service;
import main.java.br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class BonusService {

    public BigDecimal calcularBonus(Funcionario funcionario) {
        BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
        if (valor.compareTo(new BigDecimal("1000")) > 0) {
            throw new IllegalArgumentException("O funcionario tem o salário maior que 10.000 não é elegivel a bonus.");
        }
        return valor;
    }

}
