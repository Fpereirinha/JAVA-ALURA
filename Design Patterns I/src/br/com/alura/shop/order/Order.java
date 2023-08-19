package br.com.alura.shop.order;

import br.com.alura.shop.Budget.Budget;

import java.time.LocalDateTime;

public class Order {
    private String client;
    private LocalDateTime data;
    private Budget budget;

    public Order(String client, LocalDateTime data, Budget budget) {
        this.client = client;
        this.data = data;
        this.budget = budget;
    }

    public String getClient() {
        return client;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Budget getBudget() {
        return budget;
    }

}
