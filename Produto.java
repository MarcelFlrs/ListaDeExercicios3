public class Produto {
    public double precoDeCusto;
    public double acrescimo;
    public double porcentagem;
    public double valorVenda;

    public void calcValorVenda(){
        porcentagem = acrescimo * 0.1;
        valorVenda = precoDeCusto + (precoDeCusto * porcentagem);
    }
}

