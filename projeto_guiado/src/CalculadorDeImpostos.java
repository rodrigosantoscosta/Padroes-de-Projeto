//criar um "CalculadorDeImpostos" que recebe um objeto Tributavel e exibe o valor do imposto a ser pago
public class CalculadorDeImpostos {
    public double calcular(Tributavel t) {
        double imposto = t.calcularImposto();

        return imposto;
    }
}
