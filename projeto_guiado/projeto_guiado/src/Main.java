public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Bob Marley", "12345678900");

        ContaCorrente contaCorrente = new ContaCorrente(12345, 1);
        ContaPoupanca contaPoupanca = new ContaPoupanca(1234, 1);

        //Adição de contas a lista de Clientes
        cliente.adicionarConta(contaCorrente);
        cliente.adicionarConta(contaPoupanca);

        //getSaldo
        System.out.println("Saldo inicial conta corrente: R$" + contaCorrente.getSaldo());
        System.out.println("Saldo inicial conta poupança: R$" + contaPoupanca.getSaldo());

        //Objeto cliente tem duas contas
        contaCorrente.depositar(100);
        contaPoupanca.depositar(50);

        //Saldo apoós deposito
        System.out.println("Saldo conta corrente após deposito de R$100,00: R$" + contaCorrente.getSaldo());
        System.out.println("Saldo conta poupança após deposito de R$50,00: R$" + contaPoupanca.getSaldo());

        //Saque em contaCorrente
        contaCorrente.sacar(20);
        System.out.println("Saldo contaCorrente após sacar R$20,00, com taxa fixa de R$5,00 aplicada na conta corrente R$" + contaCorrente.getSaldo());

        //Transferencia contaPoupança para contaCorrente
        contaPoupanca.transferir(10, contaCorrente);
//        //Falta atualizar saldo após transferencia
//        System.out.println("Saldo contaCorrente: R$" + contaCorrente.getSaldo());
        System.out.println("Saldo contaPoupança após transferencia: R$" + contaPoupanca.getSaldo());

        // Calculando imposto fixo de 1%
        CalculadorDeImpostos calculo = new CalculadorDeImpostos();
        double imposto = calculo.calcular(contaCorrente);
        System.out.println("Imposto aplicado ao saldo atual de contaCorrente: " + imposto);
    }
}
