import java.math.BigDecimal;
import java.text.DecimalFormat;

public class controleBonificacao {
    private double soma;


    public String getSoma() {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(soma);
    }

    public void registra(funcionario f) {
        double valor = f.getBonificacao(.1);
        this.soma += valor;
    }

}
