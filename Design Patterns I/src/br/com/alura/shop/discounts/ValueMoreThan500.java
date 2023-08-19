package br.com.alura.shop.discounts;

import br.com.alura.shop.Budget.Budget;

import java.math.BigDecimal;

public class ValueMoreThan500 extends Discount{

    public ValueMoreThan500(Discount next) {
        super(next);
    }

    @Override
    public BigDecimal doCalculate(Budget budget) {

        return budget.getValue().multiply(new BigDecimal(".05"));

    }

    @Override
    public boolean mustApply(Budget budget) {
        return budget.getValue().compareTo(new BigDecimal(500)) > 0;
    }
}
