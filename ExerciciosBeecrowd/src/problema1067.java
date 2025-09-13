import java.util.Scanner;

public class problema1067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorX = scanner.nextInt();

        for(int i = 1; i <= valorX; i++){
            boolean ehImpar = i % 2 != 0;
            if(ehImpar) System.out.println(i);
        }
    }
}
