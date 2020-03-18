import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome1, nome2;
        Scanner sc1 = new Scanner(System.in);
        nome1 = sc1.nextLine();
        nome2 = sc1.nextLine();
        System.out.println("Quantidade de letras do nome 1: "+nome1.length()+"\nQuantidade de letras do nome 2: "+ nome2.length());
        System.out.println("nome 1 maiúsculo: "+nome1.toUpperCase()+"\nnome 2 maiúsculo: "+ nome2.toUpperCase());
        System.out.println(nome1.equals(nome2) ? "São iguais" : "São diferentes" );
    }
}
