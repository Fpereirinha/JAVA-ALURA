package br.com.alura.shop.Budget.situation;

import br.com.alura.shop.Budget.Budget;

import java.math.BigDecimal;

public class Reproved extends BudgetStatus{
    public void finish(Budget budget){
        budget.setSituation(new Finished());
    }
}
