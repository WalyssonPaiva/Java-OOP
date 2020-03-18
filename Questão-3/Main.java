import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number1, number2;
        Scanner sc1 = new Scanner(System.in);

        number1 = sc1.nextDouble();
        number2 = sc1.nextDouble();
        
        System.out.println( number1>number2 ? "Maior: "+ number1+"\nMenor: "+ number2 : "Maior: "+ number2+"\nMenor: "+ number1);
    }
}
