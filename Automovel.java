public class Automovel {
    public double distanciaTotal;
    public double combustivelGasto;
    public double consumoMedio;


    public void calcConsumo(){
        consumoMedio = distanciaTotal / combustivelGasto;
    }
}
