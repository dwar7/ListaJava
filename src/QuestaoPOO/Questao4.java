package QuestaoPOO;

/*
 * Aluna: Diúle Guerra     Data: 20/09/23
Professor: Fábio

4.Faça uma um procedimento que recebe por parâmetro o tempo de duração de uma 
fábrica expressa em segundos e imprima esse tempo em horas, minutos e segundos 
(hh:mm:ss). 

 */
import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo de duração em segundos: ");
        int tempoEmSegundos = scanner.nextInt();

        imprimirTempo(tempoEmSegundos);

        scanner.close();
    }

    public static void imprimirTempo(int tempoEmSegundos) {
        int horas = tempoEmSegundos / 3600;
        int minutos = (tempoEmSegundos % 3600) / 60;
        int segundos = tempoEmSegundos % 60;

        System.out.println("Tempo em hh:mm:ss: " + String.format("%02d:%02d:%02d", horas, minutos, segundos));
    }
}
