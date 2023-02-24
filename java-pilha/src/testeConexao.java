public class testeConexao {
    public static void main(String[] args) {

        try (conexao c = new conexao()) {
            c.leDados();
        } catch (Exception x) {
            System.out.println(x);
        }
        ;

    }
}
