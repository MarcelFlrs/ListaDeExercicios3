public class Exercicio01 {
    public static void executar() {
        
        Aluno aluno1 = new Aluno();
        System.out.println("Digite abaixo os dados do aluno ");
        aluno1.nome = Prompt.lerLinha("Nome do aluno: ");
        aluno1.nota1 = Prompt.lerDecimal("Primeira nota: ");
        aluno1.nota2 = Prompt.lerDecimal("Segunda nota: ");
        aluno1.nota3 = Prompt.lerDecimal("Terceira nota: ");
        aluno1.calcMedia();

        System.out.println("\nNome do aluno: " + aluno1.nome);
        System.out.printf("Média: %.1f", aluno1.mediaFinal);
    }
}
