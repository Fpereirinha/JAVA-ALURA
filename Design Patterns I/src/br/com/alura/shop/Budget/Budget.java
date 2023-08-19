package br.com.alura.shop.Budget;

import br.com.alura.shop.Budget.situation.BudgetStatus;
import br.com.alura.shop.Budget.situation.Pending;

import java.math.BigDecimal;
import java.util.Objects;

public class Budget {
    private BigDecimal value;
    private final int quantity;
    private BudgetStatus situation;

    public Budget(BigDecimal value, int quantity) {
        this.value = value;
        this.quantity = quantity;
        this.situation = new Pending();
    }
    public void applyExtraDiscount(){
        BigDecimal valueOfDiscount = this.situation.calculateExtraDiscount(this);


        this.value = this.value.subtract(valueOfDiscount);
    }
    public BigDecimal getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }

    public BudgetStatus getSituation() {
        return situation;
    }

    public void setSituation(BudgetStatus situation) {
        this.situation = situation;
    }
    public void approved(){
        this.situation.approved(this);
    }
    public void reproved(){
        this.situation.reproved(this);
    }
    public void finish(){
        this.situation.finish(this);
    }
}
