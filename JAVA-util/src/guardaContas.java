import ByteBank.Modelo.*;


public class guardaContas {
    private Conta[] referencias;
    private int posicaoLivre;
    public guardaContas(){
        this.referencias = new Conta[10];
        this.posicaoLivre = 0;
    }
    void adiciona(Conta ref){
        this.referencias[posicaoLivre] = ref;
        this.posicaoLivre++;
    }
    int getQtd(){
        return this.posicaoLivre;
    }
}
