import java.util.Scanner;

public class problema1035 {
    public static void main(String[] args) {
        //Leitura de valores
        Scanner scanner = new Scanner(System.in);
        int valorA = scanner.nextInt();
        int valorB = scanner.nextInt();
        int valorC = scanner.nextInt();
        int valorD = scanner.nextInt();
        boolean primeiraCondicao = false;
        boolean segundaCondicao = false;
        boolean terceiraCondicao = false;
        boolean quartaCondicao = false;
        boolean valido = false;

        if(valorB > valorC){
            primeiraCondicao = true;
        }

        if(valorD > valorA){
            segundaCondicao = true;
        }

        if(valorC + valorD > valorA + valorB){
            terceiraCondicao = true;
        }

        if(valorC > 0 && valorD > 0 && valorA % 2 == 0){
            quartaCondicao = true;
        }


        if(primeiraCondicao && segundaCondicao && terceiraCondicao && quartaCondicao){
            valido = true;
        }

        if(valido){
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }
    }
}
