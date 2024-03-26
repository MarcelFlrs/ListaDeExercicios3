public class Vendedor {
    public String nome;
    public double salario;
    public double vendas;
    public double salarioFinal;
    public double comissao;


    public void calcSalarioFinal(){
        comissao = vendas * 0.15;
        salarioFinal = salario + comissao;
    }

}
