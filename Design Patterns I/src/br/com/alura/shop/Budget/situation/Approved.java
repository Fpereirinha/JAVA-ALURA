package br.com.alura.shop.Budget.situation;

import br.com.alura.shop.Budget.Budget;
import br.com.alura.shop.DomainException;

import java.math.BigDecimal;

public class Approved extends BudgetStatus {
    public BigDecimal calculateExtraDiscount(Budget budget){
        return budget.getValue().multiply(new BigDecimal(".02"));
    }

    public void finish(Budget budget) {
        budget.setSituation(new Finished());
    }
}
