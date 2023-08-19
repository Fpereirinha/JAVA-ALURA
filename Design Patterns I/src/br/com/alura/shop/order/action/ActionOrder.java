package br.com.alura.shop.order.action;

import br.com.alura.shop.Budget.Budget;

public interface ActionOrder {
    abstract void execute(Budget budget);
}
