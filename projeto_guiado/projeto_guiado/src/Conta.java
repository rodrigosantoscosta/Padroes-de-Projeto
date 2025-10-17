

public class Conta {
    //Uma classe Conta com atributos (agencia, numero, saldo)
    //e métodos (sacar, depositar, transferir).
    private long numero;
    private int agencia;
    private double saldo;


    public Conta(long numero, int agencia) {
        this.numero = numero;
        this.agencia = agencia;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo+= valor;
        }
    }

}
