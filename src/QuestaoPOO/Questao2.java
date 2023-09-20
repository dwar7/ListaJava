/*
 * Aluna: Diúle Guerra     Data: 20/09/23
Professor: Fábio

2.Escreva um procedimento que recebe as 3 notas de um aluno por parâmetro e uma 
letra. Se a letra for A o procedimento calcula e imprime a média aritmética das
notas do aluno, se for P, a sua média ponderada (pesos: 5, 3 e 2) e se for H, a
sua média harmônica.

 */
package QuestaoPOO;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno: ");
        double n1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota do aluno: ");
        double n2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota do aluno: ");
        double n3 = scanner.nextDouble();

        System.out.println("Digite 'A' para Média Aritmética, 'P' para Média Ponderada ou 'H' para Média Harmônica: ");
        char tipoMedia = scanner.next().charAt(0);

        calcularMedia(n1, n2, n3, tipoMedia);

        scanner.close();
    }

    public static void calcularMedia(double n1, double n2, double n3, char tipoMedia) {
        double media = 0;

        if (tipoMedia == 'A') {
            // Calculando a média aritmética
            media = (n1 + n2 + n3) / 3;
            System.out.println("Média Aritmética: " + media);
        } else if (tipoMedia == 'P') {
            // Calculando a média ponderada com pesos: 5, 3 e 2
            media = (5 * n1 + 3 * n2 + 2 * n3) / 10;
            System.out.println("Média Ponderada: " + media);
        } else if (tipoMedia == 'H') {
            // Calculando a média harmônica
            media = 3 / ((1 / n1) + (1 / n2) + (1 / n3));
            System.out.println("Média Harmônica: " + media);
        } else {
            System.out.println("Tipo de média inválido. Use 'A' para Média Aritmética, 'P' para Média Ponderada ou 'H' para Média harmônica.");
        }
    }
}
