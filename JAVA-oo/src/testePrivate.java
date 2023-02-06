public class testePrivate {
    public static void main(String[] args) {
        Conta conta = new contaCorrente();
        conta.titular = new Pessoa();
        conta.titular.nome = "Pedro";
        conta.deposita(100);
        System.out.println(conta.getSaldo());
        System.out.println(conta.getClass());

    }
}
