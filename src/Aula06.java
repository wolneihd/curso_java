import java.util.Scanner;

public class Aula06 {
    public static void main(String[] args) {
        int[] num = new int[5];

        num[0]=1;
        num[1]=2;
        num[2]=3;
        num[3]=4;
        num[4]=5;
        
        System.out.printf("\n%d",num[0]);

        int[] numeros = {10,20,30,40,50};
        System.out.printf("\n%d",numeros[0]);

        for (int i=0;i<5;i++) {
            System.out.printf("\n%d",numeros[i]);
        }

        //--------- Exercicio --------- 

        final int tam=5;
        char[] gabarito = {'a','d','c','a','d'};
        char[] resposta = new char[tam];
        int nota = 0; 

        //resposta[0]='a';
        //resposta[1]='b';
        //resposta[2]='a';
        //resposta[3]='d';
        //resposta[4]='a';

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        
        for (int i=0;i<gabarito.length;i++) {
            System.out.println("\nDigite a sua nota: ");
            resposta[i] = scan.nextLine().charAt(0);
            if (resposta[i] == gabarito [i]) {
                nota++;
            }
        }

        System.out.println("Nota do aluno foi: " + nota);
    }
}
