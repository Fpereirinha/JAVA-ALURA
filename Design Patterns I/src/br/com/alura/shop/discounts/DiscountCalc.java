package br.com.alura.shop.discounts;

import br.com.alura.shop.Budget.Budget;

import java.math.BigDecimal;

public class DiscountCalc {
    public BigDecimal calculate(Budget budget){
        Discount discount = new MoreThan5(new ValueMoreThan500(new WithoutDiscount()));
        return discount.calculate(budget);
    }
}
