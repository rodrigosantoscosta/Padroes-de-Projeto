import java.util.Scanner;

public class problema1005 {
    public static void main(String[] args) {
        //Ler dois valores
        Scanner scanner = new Scanner(System.in);
        double notaA = scanner.nextDouble();
        double notaB = scanner.nextDouble();
        //Definir os pesos numa configuração interna
        double pesoA = 3.5;
        double pesoB = 7.5;

        //Calcular média
        double somaPesos  = pesoA + pesoB;
        double media = ((notaA * pesoA) + (notaB * pesoB)) / somaPesos;

        //Imprimir média
        System.out.printf("MEDIA = %.5f", media);
    }
}
