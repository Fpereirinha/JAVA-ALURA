package br.com.alura.shop;
import br.com.alura.shop.Budget.Budget;
import br.com.alura.shop.Fees.FeeCalc;
import br.com.alura.shop.Fees.TypeFeeEnumExample;
import java.math.BigDecimal;

public class FeeTest {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"), 2);
        FeeCalc feeCalc = new FeeCalc();
        System.out.println(feeCalc.calculate(budget, TypeFeeEnumExample.ICMS));
    }
}
