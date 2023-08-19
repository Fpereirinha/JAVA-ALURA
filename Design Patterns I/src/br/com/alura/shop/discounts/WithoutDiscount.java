package br.com.alura.shop.discounts;

import br.com.alura.shop.Budget.Budget;

import java.math.BigDecimal;

public class WithoutDiscount extends Discount{

    public WithoutDiscount() {
        super(null);
    }

    @Override
    public BigDecimal doCalculate(Budget budget) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean mustApply(Budget budget) {
        return true;
    }
}
