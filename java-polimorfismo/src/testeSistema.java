public class testeSistema {
    public static void main(String[] args) {
        gerente g = new gerente();
        g.setSenha(222);
        system s = new system();
        s.autentica(g);
        administrador adm = new administrador();
        adm.setSenha(222);
        s.autentica(adm);
    }
}
