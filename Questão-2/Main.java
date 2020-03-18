import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        double number;
        Scanner sc1 = new Scanner(System.in);
        number = sc1.nextDouble();
        //retorna um int
        System.out.println("Usando round: "+ Math.round(number));
        //arredonda para o mais alto
        System.out.println("Usando ceil: "+ Math.ceil(number));
        //arredonda para o mais baixo
        System.out.println("Usando floor: "+ Math.floor(number));
    }
}
