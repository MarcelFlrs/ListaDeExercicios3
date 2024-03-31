public class Produto {
    public double precoDeCusto;
    public double porcentagemAcrescimo;
    public double valorVenda;

    public void calcValorVenda(){
        valorVenda = precoDeCusto + (precoDeCusto * porcentagemAcrescimo);
    }
}

