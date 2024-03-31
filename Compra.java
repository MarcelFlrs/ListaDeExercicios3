public class Compra {
    public double valor;
    public double QuantPrestacao = 5;
    public double valorPorPrestacao;

    public void calcPrestacoes(){
        valorPorPrestacao = valor / QuantPrestacao;
    }
}
