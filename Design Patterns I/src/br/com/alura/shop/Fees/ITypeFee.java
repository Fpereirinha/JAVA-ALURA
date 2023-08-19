package br.com.alura.shop.Fees;

import br.com.alura.shop.Budget.Budget;

import java.math.BigDecimal;

public interface ITypeFee {
    BigDecimal calcular(Budget budget);
}
