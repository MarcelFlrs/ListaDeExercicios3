public class Exercicio05 {
    public static void executar() {
        System.out.println("Produtos em 5 prestações sem juros");
        Compra compra1 = new Compra();
        compra1.valor = Prompt.lerDecimal("Digite o valor da compra: ");
        compra1.calcPrestacoes();

        System.out.printf("O valor de cada prestação é: R$ %.2f", compra1.valorPorPrestacao );
    }
}
