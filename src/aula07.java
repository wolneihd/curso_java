import java.util.Arrays;

public class aula07 {
    public static void main(String[] args) {
        int[] num = {10,20,30,40,50}; 

        // opção 01 ==> FOR
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }

        // opção 02 ==> FOR
        for (int n:num) {
            System.out.println(n);
        }

        // organizar por ordem 
        int[] lista = {1,5,2,4,7,2,1,3,6,8};

        Arrays.fill(lista,10);
        Arrays.sort(lista);

        for (int n:lista) {
            System.out.println(n);
        }
        
        // validação simplificada:
        System.out.println((0 == 0) ? "true" : "false");
    }
}
