public class conexao implements AutoCloseable {

    public conexao() {
        System.out.println("Abrindo conexao");
        throw new NullPointerException();
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException();
    }

    public void fecha() {
        System.out.println("Fechando conexao");
    }

    @Override
    public void close() {
        fecha();
    }
}