public class testeGerente {
    public static void main(String[] args) {
        gerente Pedro = new gerente("Pedro", "465464", 54545);
        System.out.println(Pedro.getAll());System.out.println(Pedro.autentica(312));
        Pedro.setSenha(43929336);
        System.out.println(Pedro.autentica(43929336));
        System.out.println(Pedro.getBonificacao());

    }

}
