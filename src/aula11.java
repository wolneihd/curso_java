public class aula11 {
    public static void main(String[] args) {

        Jogador jogador_01 = new Jogador(1);
        Jogador jogador_02 = new Jogador(2);

        jogador_01.setVidas(100);
        int valor = jogador_01.getVidas();
        System.out.println(" vidas >> "+ valor);
    }
}
