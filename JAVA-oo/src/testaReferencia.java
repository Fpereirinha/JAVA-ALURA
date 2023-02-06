public class testaReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new contaCorrente();
        System.out.println(primeiraConta.getSaldo());

        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = new contaCorrente();

        System.out.println("primeira conta tem " + primeiraConta.getSaldo());
        System.out.println("segunda conta tem " + segundaConta.getSaldo());

        segundaConta.agencia = "146";
        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

        System.out.println(segundaConta.agencia);

        segundaConta.agencia = "146";
        System.out.println("agora a segunda conta está na agencia " + segundaConta.agencia);

        if (primeiraConta == segundaConta) {
            System.out.println("mesma conta");
        } else {
            System.out.println("contas diferentes");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
        System.out.println(primeiraConta.getTotal());
    }
}
