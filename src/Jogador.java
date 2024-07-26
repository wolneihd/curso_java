public class Jogador {

    private int num = 0;
    private int vidas = 0;
    static boolean alerta = true;
    static int qtdJodadores = 0;

    public Jogador(int num) {
        this.num = num;
        this.vidas = 3;
        System.out.printf("\nJogador Criado " + num);
        qtdJodadores++;
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

    public void info(){
        System.out.printf("\nvidas: " + getVidas());
        System.out.printf("\nalerta: " + alerta);
        System.out.printf("\nqtdJogadores: " + qtdJodadores);
    }

}
