/*
 * Aluna: Diúle Guerra     Data: 20/09/23
Professor: Fábio

3.Faça uma função que recebe por parâmetro um valor inteiro e positivo e retorna
o valor lógico Verdadeiro caso o valor seja primo e Falso em caso contrário.  O 
programa principal imprimirá o texto “O Número é Primo”, caso a função retorne
verdadeiro.

 */
package QuestaoPOO;

import java.util.Scanner;

public class Questao3 {
    
        public static void main(String[] args) {
            
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (ehPrimo(numero)) {
            System.out.println("O Número é Primo");
        } else {
            System.out.println("O Número não é Primo");
        }

        scanner.close();
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }

        if (numero <= 3) {
            return true; // 2 e 3 são primos
        }

        if (numero % 2 == 0 || numero % 3 == 0) {
            return false; // Números divisíveis por 2 ou 3 não são primos
        }

        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false; // Números divisíveis por i ou i + 2 não são primos
            }
        }

        return true; // Se nenhum divisor foi encontrado, o número é primo
    }
}