

public class Conta {
    //Uma classe Conta com atributos (agencia, numero, saldo)
    //e métodos (sacar, depositar, transferir).

    //Atributos da classe usando private
    private long numero;
    private int agencia;
    private double saldo;

    //Construtor
    public Conta(long numero, int agencia) {
        this.numero = numero;
        this.agencia = agencia;
    }

    //Método para sacar verificando se tem saldo disponivel
    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    //Deposito simples sem taxas verificando se o valor é maior que 0
    public void depositar(double valor){
        if(valor > 0){
            saldo+= valor;
        }
    }

    //Transferencia simples sem taxas verificando se tem saldo disponivel
    public boolean transferir(double valor, Conta contaDestino) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    //Getters e setters
    public double getSaldo() {
        return saldo;
    }

    public long getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }


}
