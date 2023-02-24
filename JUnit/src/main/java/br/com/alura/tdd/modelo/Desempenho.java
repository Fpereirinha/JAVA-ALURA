package main.java.br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum Desempenho {
    A_DESEJAR {
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("1.03");
        }
    }, OTIMO {
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("1.20");
        }
    }, BOM {
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("1.15");
        }
    };

    public abstract BigDecimal percentualReajuste();
}
