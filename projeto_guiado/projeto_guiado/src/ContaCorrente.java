//Classes ContaCorrente e ContaPoupanca que herdam de Conta
public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente( long numero, int agencia) {
        super(numero, agencia);
    }

    @Override
    //Polimorfismo sobrescrevendo o metodo sacar de Conta aplicando
    // uma taxa fixa
    public boolean sacar(double valor) {
        double taxaFixa = 5.00; // Taxa fixa de R$5,00
        return super.sacar(valor + taxaFixa);
    }

    @Override
    public double calcularImposto() {
        //Utilizando o metodo da interface Tributavel
        // para aplicar imposto de 1%
        return this.getSaldo() * 0.01;
    }
}