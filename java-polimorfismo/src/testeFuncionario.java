public class testeFuncionario {
    public static void main(String[] args) {
        funcionario Pedro = new funcionario("Pedro", "56465456", 2000);
        System.out.println(Pedro.getCPF());
        System.out.println(Pedro.getNome());
        System.out.println(Pedro.getSalario());
        System.out.println(Pedro.getBonificacao(.01));
        System.out.println(Pedro.getSalario());
        funcionario Joao = new funcionario("Joao", "4554456",2000);
        System.out.println(Joao.getSalario());
        Joao.getBonificacao(.01);
        System.out.println(Joao.getSalario());
    }
}
