import java.util.Scanner;

public class problema1070 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int horaInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();


        if(horaInicial == horaFinal) System.out.println("O JOGO DUROU 24 HORA(S)");

        if(horaInicial > horaFinal) System.out.println("O JOGO DUROU " + ((24 - horaInicial) + horaFinal) + " HORA(S)");

        if(horaInicial < horaFinal) System.out.println("O JOGO DUROU " + (horaFinal - horaInicial) + " HORA(S)");


    }
}
