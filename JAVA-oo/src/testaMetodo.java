public class testaMetodo {
    public static void main(String[] args) {
        Conta Pedro = new Conta();
        System.out.println(Pedro.getSaldo());
        Pedro.deposita(100);
        System.out.println(Pedro.getSaldo());
        Pedro.saca(1000);
        System.out.println(Pedro.getSaldo());
        Pedro.saca(50);
        System.out.println(Pedro.getSaldo());
        Conta Gabriel = new Conta();
        Pedro.transfere(Gabriel, 50);
        System.out.println(Pedro.getSaldo());
        System.out.println(Gabriel.getSaldo());
        System.out.println(Pedro.getSaldo());
        Pedro.setNumero("22");
    }
}
