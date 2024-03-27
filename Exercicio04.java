public class Exercicio04 {
    public static void executar() {
        System.out.println("Conversão de um valor em dólar(US$) para real(R$)");
        Dolar dolarAtual = new Dolar();
        dolarAtual.cotacao = Prompt.lerDecimal("Digite o valor da cotação atual do dólar: ");
        dolarAtual.valor = Prompt.lerDecimal("Digite o valor disponível em dólar: ");
        dolarAtual.conversao();
        
        System.out.printf("Valor convertido para reais: %.2f", dolarAtual.valorConvertido);
    }
}
