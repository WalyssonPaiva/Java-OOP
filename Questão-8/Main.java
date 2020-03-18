import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt();
        int menorPos = 0, maiorPos = 0;
        double maior=0, menor=9999, media=0;
        String[] nomes = new String[x];
        double[] salarios = new double[x];

        for(int i = 0; i<x; i++){
            sc1.nextLine();
            nomes[i] = sc1.nextLine();
            salarios[i] = sc1.nextDouble();
        }
        
        //pegar o maior, menor e media
         for(int i = 0; i<x; i++){
            if(salarios[i]>maior){
                maior = salarios[i];
                maiorPos = i;
            }if(salarios[i]<menor){
                menor = salarios[i];
                menorPos = i;
            }       
            media+=salarios[i]; 
        }
        media/=x;
        System.out.println("Maior salário: "+maiorPos+" - "+nomes[maiorPos]+", "+salarios[maiorPos]);
        System.out.println("Menor salário: "+menorPos+" - "+nomes[menorPos]+", "+salarios[menorPos]);
        System.out.println("Média salárial: "+media);
        
        System.out.println("\nMaiores que a média: ");
        for(int i = 0; i<x; i++){
            if(salarios[i]>media)
                System.out.print(nomes[i]+" - "+salarios[i]+"\n");
        }

        System.out.println("\nMenores que a média: ");
        for(int i = 0; i<x; i++){
            if(salarios[i]<media)
                System.out.print(nomes[i]+" - "+salarios[i]+"\n");
        }
        System.out.println("");
    }

}
