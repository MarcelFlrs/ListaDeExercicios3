public class Exercicio06 {
    public static void executar() {
        Produto produto1 = new Produto();
        produto1.precoDeCusto = Prompt.lerDecimal("Digite o preço de custo do produto: ");
        produto1.acrescimo = Prompt.lerDecimal("Digite a porcentagem de acréscimo: ");
        produto1.calcValorVenda();

        System.out.printf("O valor da venda do produto é: %.1f", produto1.valorVenda);
    }
}
