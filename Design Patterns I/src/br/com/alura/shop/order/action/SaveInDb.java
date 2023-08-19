package br.com.alura.shop.order.action;

import br.com.alura.shop.Budget.Budget;

public class SaveInDb implements  ActionOrder{
    public void execute(Budget budget){
        System.out.println("Salvando pedido no db.");
    }
}
