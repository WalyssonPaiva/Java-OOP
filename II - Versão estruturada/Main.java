
public class Main{
    public static void main(String[] args){
        
        double[] aluno1 = { 6, 4, 5 };
        double[] aluno2 = { 10, 10, 10 };
        double[] aluno3 = { 7, 5, 8 };
        double[] aluno4 = { 7, 4, 9 };

        double media_aluno1 = (aluno1[0]+aluno1[1]+aluno1[2])/3;
        double media_aluno2 = (aluno2[0]+aluno2[1]+aluno2[2])/3;
        double media_aluno3 = (aluno3[0]+aluno3[1]+aluno3[2])/3;
        double media_aluno4 = (aluno4[0]+aluno4[1]+aluno4[2])/3;
        double media_geral = (media_aluno1+media_aluno2+media_aluno3+media_aluno4)/4;

        System.out.println("Média do aluno 1: " + media_aluno1);
        System.out.println("Média do aluno 2: " + media_aluno2);
        System.out.println("Média do aluno 3: " + media_aluno3);
        System.out.println("Média do aluno 4: " + media_aluno4);
        //retornando a média geral
        System.out.println("Média geral: " + media_geral);

        
    }
}