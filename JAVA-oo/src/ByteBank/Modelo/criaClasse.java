package ByteBank.Modelo;

public class criaClasse {
    public static void main(String[] args) {
        Conta Pedro = new contaCorrente();
        Pedro.agencia = "1195";
        Pedro.numero = "439293";
        System.out.printf("Meu nome é %s, agencia é %s, numero é %s, saldo é %,.2f",
                Pedro.titular,
                Pedro.agencia,
                Pedro.numero,
                Pedro.getSaldo());
        Conta Gabriel = new contaCorrente();
        Gabriel.numero = "5555";
        Gabriel.agencia = "321321";

    }
}
