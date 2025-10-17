public class Main {
    public static void main(String[] args) {
        //Criar cliente
        Cliente cliente = new Cliente("Bob Marley", "12345678900");

        ContaCorrente contaCorrente = new ContaCorrente(12345, 1);
        ContaPoupanca contaPoupanca = new ContaPoupanca(1234, 1);

        //Associação de contas a lista de Clientes
        cliente.adicionarConta(contaCorrente);
        cliente.adicionarConta(contaPoupanca);

        //Exibir saldo
        System.out.println("Saldo inicial conta corrente: R$" + contaCorrente.getSaldo());
        System.out.println("Saldo inicial conta poupança: R$" + contaPoupanca.getSaldo());

        //Depositar
        contaCorrente.depositar(100);
        contaPoupanca.depositar(50);

        //Saldo apoós deposito
        System.out.println("Saldo conta corrente após deposito de R$100,00: R$" + contaCorrente.getSaldo());
        System.out.println("Saldo conta poupança após deposito de R$50,00: R$" + contaPoupanca.getSaldo());

        //Saque em contaCorrente com taxa
        contaCorrente.sacar(20);
        System.out.println("Saldo contaCorrente após sacar R$20,00, com taxa fixa de R$5,00 aplicada na conta corrente R$" + contaCorrente.getSaldo());

        //Transferencia entre contas - contaPoupança para contaCorrente
        contaPoupanca.transferir(10, contaCorrente);
//        //Falta atualizar saldo após transferencia na contaCorrente
//        System.out.println("Saldo contaCorrente: R$" + contaCorrente.getSaldo());
        System.out.println("Saldo contaPoupança após fazer a transferencia de R$10,00: R$" + contaPoupanca.getSaldo());

        // Calculando imposto fixo de 1%
        CalculadorDeImpostos calculo = new CalculadorDeImpostos();
        double imposto = calculo.calcular(contaCorrente);
        System.out.println("Calculo do imposto ao saldo atual de contaCorrente R$" + contaCorrente.getSaldo() + ": R$" + imposto);
    }
}
