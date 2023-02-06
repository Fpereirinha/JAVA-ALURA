public class system {
    private final int senha = 222;

    public void autentica(autenticacao g) {
        if (g.autentica(this.senha)) {
            System.out.println("Usuario autenticado.");
        } else {
            System.out.println("Senha incorreta.");
        }


    }
}
