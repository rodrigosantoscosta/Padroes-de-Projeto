import java.util.Scanner;

public class problema1006 {
    public static void main(String[] args) {
        //Ler  valores
        Scanner scanner = new Scanner(System.in);
        double notaA = scanner.nextDouble();
        double notaB = scanner.nextDouble();
        double notaC = scanner.nextDouble();
        //Definir os pesos numa configuração interna
        double pesoA = 2;
        double pesoB = 3;
        double pesoC = 5;

        //Calcular média
        double somaPesos  = pesoA + pesoB + pesoC;
        double media = ((notaA * pesoA) + (notaB * pesoB) + (notaC * pesoC)) / somaPesos;

        //Imprimir média
        System.out.printf("MEDIA = %.1f\n", media);
    }
}
