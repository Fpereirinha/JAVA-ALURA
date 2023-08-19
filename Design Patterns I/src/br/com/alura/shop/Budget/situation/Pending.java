package br.com.alura.shop.Budget.situation;

import br.com.alura.shop.Budget.Budget;
import br.com.alura.shop.DomainException;

import java.math.BigDecimal;

public class Pending extends BudgetStatus{
    public BigDecimal calculateExtraDiscount(Budget budget){
        return budget.getValue().multiply(new BigDecimal(".05"));
    }
    public void approved(Budget budget){
        budget.setSituation(new Approved());
    }
    public void reproved(Budget budget){
        budget.setSituation(new Reproved());
    }
    public void finish(Budget budget){
        budget.setSituation(new Finished());
    }
}
