package br.com.alura.shop.Budget;

import java.math.BigDecimal;

public class Budget {
    private BigDecimal value;
    private int quantity;

    public Budget(BigDecimal value, int quantity) {
        this.value = value;
        this.quantity = quantity;
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }
}
