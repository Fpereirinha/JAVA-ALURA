package br.com.alura.shop;

import br.com.alura.shop.Budget.Budget;
import br.com.alura.shop.discounts.DiscountCalc;

import java.math.BigDecimal;

public class DiscountTest {
    public static void main(String[] args) {
        Budget first = new Budget(new BigDecimal("200"), 10);
        Budget second = new Budget(new BigDecimal("1000"), 1);
        DiscountCalc calc = new DiscountCalc();
        System.out.println(calc.calculate(first));
        System.out.println(calc.calculate(second));
    }
}
