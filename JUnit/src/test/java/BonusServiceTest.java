package test.java;

import main.java.br.com.alura.tdd.modelo.Funcionario;
import main.java.br.com.alura.tdd.service.BonusService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void bonusDeveriaSerZeroParaSalarioAlto() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Pedro", LocalDate.now(), new BigDecimal("100000")));
        assertEquals(BigDecimal.ZERO, bonus);
    }
    @Test
    void bonusDeveriaSerDezPorCentoParaSalarioMenorIgualDezMil() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Pedro", LocalDate.now(), new BigDecimal("10000")));
        assertEquals(new BigDecimal("1000.0"), bonus);
    }
}