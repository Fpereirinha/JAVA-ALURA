package br.com.alura.shop.Fees;

import br.com.alura.shop.Budget.Budget;

import java.math.BigDecimal;

public class FeeCalc {
    public BigDecimal calculate(Budget budget, TypeFeeEnumExample Fee){
        return budget.getValue().multiply(Fee.getFee());
    }
}
