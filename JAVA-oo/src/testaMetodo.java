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
    }
}