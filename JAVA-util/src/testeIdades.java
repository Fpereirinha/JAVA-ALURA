import ByteBank.Modelo.*;

import java.util.Arrays;

public class testeIdades {
    public static void main(String[] args) {
        int[] idade1 = new int[5];
        for (int i = 0; i < idade1.length; i++) {
            idade1[i] = i;
        }
        for (int i = 0; i < idade1.length; i++) {
            System.out.println(idade1[i]);
        }
        //int[] idades = new int[5];
        Object[] referencias = new Object[5];

        contaCorrente cc1 = new contaCorrente();
        referencias[0] = cc1;

        contaPoupanca cc2 = new contaPoupanca();
        referencias[1] = cc2;

        Pessoa cliente = new Pessoa();
        referencias[2] = cliente;

        //System.out.println(cc2.getNumero());

        //Object referenciaGenerica = contas[1];

        //System.out.println( referenciaGenerica.getNumero() );

        contaPoupanca ref = (contaPoupanca) referencias[1]; //type cast
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());
    }
}
