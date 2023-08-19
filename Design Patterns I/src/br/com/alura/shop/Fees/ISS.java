package br.com.alura.shop.Fees;

import br.com.alura.shop.Budget.Budget;

import java.math.BigDecimal;

public class ISS implements ITypeFee{
    public BigDecimal calcular(Budget budget){
        return budget.getValue().multiply(new BigDecimal(".06"));
    }
}
