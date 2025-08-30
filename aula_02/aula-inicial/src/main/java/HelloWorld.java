public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Olá Mundo");
        Conta conta = new Conta();
        conta.saldo = 100;
        System.out.println("Saldo atual: " + conta.saldo);
        conta.sacar(50);
        System.out.print("Saldo apos saque: " + conta.saldo );
    }
}