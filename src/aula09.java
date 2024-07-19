public class aula09 {
    public static void main(String[] args) {
        // METODOS :
        msg("texto de exemplo",10);
        int resultado = somar(20,20);
        System.out.println(resultado);
        System.out.println(somarTotal(1,5,1,2,3,7,8,5));
    }

    public static void msg(String mensagem, int quantidade) {
        for (int i=0;i<quantidade;i++){
            System.out.println(mensagem);
        }
        
    }

    public static int somar (int valor_01, int valor_02) {
        int resposta = valor_01 + valor_02;
        return resposta;
    }

    public static int somarTotal (int... numeros) {
        int resposta = 0;
        for(int n:numeros) {
            resposta += n;
        }
        return resposta;
    }

}
