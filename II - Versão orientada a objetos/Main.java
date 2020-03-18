
public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno(6,4,5);
        Aluno aluno2 = new Aluno(10,10,10);
        Aluno aluno3 = new Aluno(7,5,8);
        Aluno aluno4 = new Aluno(7,4,9);

        //retornando a média
        System.out.println("Média do aluno 1: " + aluno1.calculaMedia());
        System.out.println("Média do aluno 2: " + aluno2.calculaMedia());
        System.out.println("Média do aluno 3: " + aluno3.calculaMedia());
        System.out.println("Média do aluno 4: " + aluno4.calculaMedia());
        //retornando a média geral
        System.out.println("Média geral: " + (aluno1.calculaMedia()+aluno2.calculaMedia()+aluno3.calculaMedia()+aluno4.calculaMedia())/4);
    }
}
