public class testeSistema {
    public static void main(String[] args) {
        gerente g = new gerente();
        g.setSenha(222);
        system s = new system();
        s.autentica(g);
        administrador adm = new administrador();
        adm.setSenha(222);
        s.autentica(adm);
        cliente c = new cliente();
        c.setSenha(333);
        s.autentica(c);
        autenticacao teste = new cliente();
        teste.setSenha(333);
        s.autentica(teste);
        gerente TesteAuth = new gerente("pedro", "4564654", 10000);
        TesteAuth.setSenha(2223);
        s.autentica(TesteAuth);
    }
}
