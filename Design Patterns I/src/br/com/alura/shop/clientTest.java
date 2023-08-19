package br.com.alura.shop;

import br.com.alura.shop.Budget.Budget;
import br.com.alura.shop.order.GenerateHandler;
import br.com.alura.shop.order.GenerateOrder;
import br.com.alura.shop.order.Order;
import br.com.alura.shop.order.action.SaveInDb;
import br.com.alura.shop.order.action.SendMail;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class clientTest {
    public static void main(String[] args) {
    String client = "Rodrigo";
    BigDecimal valueBudget = new BigDecimal("1000");
    int quantity = Integer.parseInt("2");
    GenerateOrder generator = new GenerateOrder(client, valueBudget, quantity);
    GenerateHandler executeGen = new GenerateHandler(
            Arrays.asList(new SaveInDb(), new SendMail())
    );
    executeGen.execute(generator);
    }
}
