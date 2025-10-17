import java.util.Scanner;

public class problema1070 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int horaInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();

        int duracao = 0;

        if(horaInicial == horaFinal) duracao = 24;

        if(horaInicial > horaFinal) duracao = (24 - horaInicial) + horaFinal;

        if(horaFinal > horaInicial) duracao = horaFinal - horaInicial;

        System.out.println("O JOGO DUROU " + (duracao) + " HORA(S)");

//        if(horaInicial == horaFinal) System.out.println("O JOGO DUROU 24 HORA(S)");
//
//        if(horaInicial > horaFinal) System.out.println("O JOGO DUROU " + ((24 - horaInicial) + horaFinal) + " HORA(S)");
//
//        if(horaInicial < horaFinal) System.out.println("O JOGO DUROU " + (horaFinal - horaInicial) + " HORA(S)");


    }
}
