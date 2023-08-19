package br.com.alura.shop.order;



import java.math.BigDecimal;


public class GenerateOrder {
    private String client;

    public String getClient() {
        return client;
    }

    public BigDecimal getBudgetValue() {
        return budgetValue;
    }

    public int getQuantityItems() {
        return quantityItems;
    }

    private BigDecimal budgetValue;
    private int quantityItems;

    public GenerateOrder(String client, BigDecimal budgetValue, int quantityItems) {
        this.client = client;
        this.budgetValue = budgetValue;
        this.quantityItems = quantityItems;
    }

}
