public class Aluno {
    private int n1, n2, n3;
    Aluno(int n1, int n2, int n3){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public double calculaMedia(){
        return (n1+n2+n3)/3d;
    }

}
