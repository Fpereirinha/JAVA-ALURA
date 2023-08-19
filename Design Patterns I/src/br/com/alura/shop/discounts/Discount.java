package br.com.alura.shop.discounts;

import br.com.alura.shop.Budget.Budget;

import java.math.BigDecimal;

public abstract class Discount {
    protected Discount next;

    public Discount(Discount next) {
        this.next = next;
    }
    public BigDecimal calculate(Budget budget){
        if (mustApply(budget)){
            return doCalculate(budget);
        }
        return next.doCalculate(budget);
    }
    protected abstract BigDecimal doCalculate(Budget budget);
    protected abstract boolean mustApply(Budget budget);
}
