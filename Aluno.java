public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    public double mediaFinal;

    public void calcMedia(){
        mediaFinal = (nota1+nota2+nota3)/3;
    }
}
