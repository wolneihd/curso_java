public class Jogador {
    
    private int num=0;
    private int vidas=0;

    public Jogador(int num){
        this.num = num;
        this.vidas = 3;
        System.out.printf("\nJogador Criado " + num);
    }

    public int getVidas() {
        return this.vidas;
    }

    public void setVidas(int vidas) {
        if (vidas > 10) {
            this.vidas = 10;
        } else {
            this.vidas = vidas;
        }        
    }

}
