/*
 * Aluna: Diúle Guerra     Data: 20/09/23
Professor: Fábio

6.Faça uma função que recebe um valor inteiro e verifica se o valor é positivo 
ou negativo. A função deve retornar um valor booleano para o programa principal 
que imprimirá o resultado.

 */
package QuestaoPOO;

import java.util.Scanner;

public class Questao6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int valor = scanner.nextInt();

        boolean resultado = verificarPositivoNegativo(valor);

        if (resultado) {
            System.out.println("O valor é positivo.");
        } else {
            System.out.println("O valor é negativo.");
        }

        scanner.close();
    }

    public static boolean verificarPositivoNegativo(int valor) {
        return valor >= 0;
    }
}
