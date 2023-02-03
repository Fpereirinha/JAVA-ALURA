public class testaMetodo {
    public static void main(String[] args) {
        Conta Pedro = new Conta();
        System.out.println(Pedro.saldo);
        Pedro.deposita(100);
        System.out.println(Pedro.saldo);
        Pedro.saca(1000);
        System.out.println(Pedro.saldo);
        Pedro.saca(50);
        System.out.println(Pedro.saldo);
        Conta Gabriel = new Conta();
        Pedro.transfere(Gabriel, 50);
        System.out.println(Pedro.saldo);
        System.out.println(Gabriel.saldo);
        System.out.println(Pedro.getSaldo());
        Pedro.setNumero("22");
    }
}
