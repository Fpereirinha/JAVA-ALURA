package br.com.alura.shop.Budget.situation;

import br.com.alura.shop.Budget.Budget;
import br.com.alura.shop.DomainException;

import java.math.BigDecimal;

public abstract class BudgetStatus {
    public BigDecimal calculateExtraDiscount(Budget budget){
        return BigDecimal.ZERO;
    }
    public void approved(Budget budget){
        throw new DomainException("Orçamento não pode ser aprovado, status inválido.");
    }
    public void reproved(Budget budget){
        throw new DomainException("Orçamento não pode ser reprovado, status inválido.");
    }
    public void finish(Budget budget){
        throw new DomainException("Orçamento não pode ser finalizado, status inválido.");
    }

}
