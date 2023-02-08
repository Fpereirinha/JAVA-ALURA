public class testeExcecao {
    public static void main(String[] args) {
        Conta c = new Conta();
        try {
            c.deposita();
            throw new minhaExcecao("Deu ruim");
        } catch (Exception err) {
            System.out.println(err);
        }
    }
}
