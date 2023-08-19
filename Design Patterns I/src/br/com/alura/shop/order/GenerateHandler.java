package br.com.alura.shop.order;

import br.com.alura.shop.Budget.Budget;
import br.com.alura.shop.order.action.ActionOrder;


import java.time.LocalDateTime;
import java.util.List;

public class GenerateHandler {
    private List<ActionOrder> actionOrderList;
    public GenerateHandler(List<ActionOrder> actionOrderList) {
        this.actionOrderList = actionOrderList;
    }


    public void execute(GenerateOrder dados){
        Budget budget = new Budget(dados.getBudgetValue(), dados.getQuantityItems());
        Order order = new Order(dados.getClient(), LocalDateTime.now(),budget);
        actionOrderList.forEach(action -> action.execute(budget));



    }
}
