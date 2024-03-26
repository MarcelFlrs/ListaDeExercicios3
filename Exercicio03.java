public class Exercicio03 {
    public static void executar() {
        
        Vendedor vendedor = new Vendedor();
        System.out.println("\nDigite abaixo as informações do vendedor");
        vendedor.nome = Prompt.lerLinha("Nome: ");
        vendedor.salario = Prompt.lerDecimal("\nSalário: ");
        vendedor.vendas = Prompt.lerDecimal("\nVendas em dinheiro: ");
        vendedor.calcSalarioFinal();

        System.out.println("\n\nInformações do vendedor");
        System.out.println("Nome: " + vendedor.nome);
        System.out.printf("Salário fixo: R$%.2f " , vendedor.salario);
        System.out.printf("\nSalário final: R$%.2f " , vendedor.salarioFinal);
    }
}
