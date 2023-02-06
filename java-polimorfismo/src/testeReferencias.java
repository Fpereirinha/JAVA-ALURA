public class testeReferencias {
    public static void main(String[] args) {
        gerente Pedro = new gerente("Pedro", "564654", 400);
        System.out.println(Pedro.getAll());
        funcionario Joao = new gerente("Joao", "44444", 1000);
        System.out.println(Joao.getAll());
        controleBonificacao controle = new controleBonificacao();


        editorVideo ev = new editorVideo();
        ev.setSalario(2000);
        controle.registra(Pedro);
        controle.registra(Joao);
        controle.registra(ev);
        System.out.println(controle.getSoma());


    }
}
