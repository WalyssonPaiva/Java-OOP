import java.util.Scanner;
import java.lang.Math;
 
public class Main {
 
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int[] quadrado = new int[10];
        int soma = 0, aux, fim = 9;
        double media;
        Scanner sc1 = new Scanner(System.in);

        for(int i = 0; i<10; i++){
            vetor[i] = sc1.nextInt();
        }
        //soma e média
        for(int i = 0; i<10; i++){
           soma+=vetor[i];
        }
        media = soma/10d;
        //novo vetor ao quadrado
        for(int i = 0; i<10; i++){
            quadrado[i] = (int) Math.pow(vetor[i], 2);
        }
        //invertendo o vetor
        for(int i = 0; i<5; i++){
            aux = vetor[i];
            vetor[i] = vetor[fim];
            vetor[fim] = aux;
            fim--;
        }
        //printando tudo
        System.out.println("Soma: "+soma+"\nMédia: "+media+"\nVetor em ordem inversa: ");
        for(int i = 0; i<10; i++){
            System.out.printf(vetor[i]+" ");
        }
        System.out.println("\nVetor ao quadrado: ");
        for(int i = 0; i<10; i++){
            System.out.printf(quadrado[i]+" ");
        }
        System.out.printf("\n");
    }
}
