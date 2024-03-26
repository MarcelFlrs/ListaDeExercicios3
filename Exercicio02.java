public class Exercicio02 {
    public static void executar() {

        Automovel automovel = new Automovel();
        System.out.println("Digite as informações abaixo para calcular o consumo médio de seu automóvel");
        automovel.distanciaTotal = Prompt.lerDecimal("Distância total percorrida (Quilômetros): ");
        automovel.combustivelGasto = Prompt.lerDecimal("Quantidade de combustível gasto (Litros): ");
        automovel.calcConsumo();

        System.out.printf("\nConsumo médio do automóvel: %.1fL" , automovel.consumoMedio);
    }
}
