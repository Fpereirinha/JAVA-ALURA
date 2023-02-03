public class criaClasse {
    public static void main(String[] args) {
        Conta Pedro = new Conta();
        Pedro.saldo = 200;
        Pedro.agencia = "1195";
        Pedro.numero = "439293";
        Pedro.titular = "Pedro";
        System.out.printf("Meu nome é %s, agencia é %s, numero é %s, saldo é %,.2f",
                Pedro.titular,
                Pedro.agencia,
                Pedro.numero,
                Pedro.saldo);
        Conta Gabriel = new Conta();
        Gabriel.saldo = 200;
        Gabriel.titular = "Gabriel";
        Gabriel.numero = "5555";
        Gabriel.agencia = "321321";

    }
}
