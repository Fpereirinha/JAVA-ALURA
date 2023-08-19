package br.com.alura.shop.order.action;

import br.com.alura.shop.Budget.Budget;

public class SendMail implements ActionOrder {
    public void execute(Budget budget){
        System.out.println("Enviando e-mail com dados do pedido.");
    }
}
