import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String nome = sc1.nextLine();

        String telefone = sc1.nextLine();
        int contador = 0;
        boolean nomeValido = true, telefoneValido = true;
        //convertendo em char
        char nomeChar[] = nome.toCharArray(); 
        char telefoneChar[] = telefone.toCharArray();

        while(contador<nomeChar.length){
             System.out.println(nomeChar[contador]);
            if(Character.isDigit(nomeChar[contador]))
                nomeValido = false;
            contador++;
        }
        contador = 0;
        while(contador<telefoneChar.length){
            if(!Character.isDigit(telefoneChar[contador]))
                telefoneValido = false;
            contador++;
        }

        System.out.println(nomeValido ? "Nome válido" : "Nome inválido");
        System.out.println(telefoneValido ? "Telefone válido" : "Telefone inválido");
    }

}
