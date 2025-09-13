import java.util.Scanner;

public class problema1035 {
    public static void main(String[] args) {
        //Leitura de valores
        Scanner scanner = new Scanner(System.in);
        int valorA = scanner.nextInt();
        int valorB = scanner.nextInt();
        int valorC = scanner.nextInt();
        int valorD = scanner.nextInt();
        //Condições
        boolean primeiraCondicao = valorB > valorC;
        boolean segundaCondicao = valorD > valorA;
        boolean terceiraCondicao = valorC + valorD > valorA + valorB;
        boolean quartaCondicao = valorC > 0 && valorD > 0 && valorA % 2 == 0;
        boolean valida = primeiraCondicao && segundaCondicao && terceiraCondicao && quartaCondicao;

        if(valida){
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }
    }
}
