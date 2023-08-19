package br.com.alura.shop.discounts;

import br.com.alura.shop.Budget.Budget;

import java.math.BigDecimal;

public class MoreThan5 extends Discount{

    public MoreThan5(Discount next) {
        super(next);
    }

    @Override
    public BigDecimal doCalculate(Budget budget) {

        return budget.getValue().multiply(new BigDecimal(".1"));


    }

    @Override
    public boolean mustApply(Budget budget) {
        return budget.getQuantity() > 5;
    }
}
