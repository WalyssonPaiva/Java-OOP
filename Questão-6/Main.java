import java.util.Scanner;
//import java.util.Arrays; poderia usar o Arrays.sort() ?

public class Main {
 
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int[] vet = new int[n];
        int aux;
        for(int i = 0; i<n;i++){
            vet[i] = sc1.nextInt();
        }
        //crescente
       
        for(int i = 0; i<n; i++){
        for(int j = 0; j<n-1; j++){
            if(vet[j] > vet[j + 1]){
                aux = vet[j];
                vet[j] = vet[j+1];
                vet[j+1] = aux;
            }
        }
    }
        System.out.println("vet em ordem crescente:");
        for(int numero : vet)
            System.out.print(numero+" ");

        //decrescente
        for(int i = 0; i<n; i++){
        for(int j = 0; j<n-1; j++){
            if(vet[j] < vet[j + 1]){
                aux = vet[j];
                vet[j] = vet[j+1];
                vet[j+1] = aux;
            }
        }
    }
        System.out.println("\nvet em ordem decrescente:");
        for(int numero : vet)
            System.out.print(numero+" ");
        System.out.println("");
        //verificar se o numero está no vet
        int x = sc1.nextInt();
        System.out.println( contains(vet, x) ? "Está no vetor" : "Não está no vetor");

        
    }
public static boolean contains(final int[] array, final int v) {

        boolean result = false;

        for(int i : array){
            if(i == v){
                result = true;
                break;
            }
        }

        return result;
    }

}
