/*
 * Aluna: Diúle Guerra     Data: 20/09/23
Professor: Fábio

1. Faça uma função que recebe por parâmetro o raio de uma esfera e calcula 
o seu volume (v = 4/3 * p * r3), onde r é o raio da esfera e p é uma constante 
igual a 3,14159265.

 */
package QuestaoPOO;

import java.util.Scanner;

public class Questao1 {

    public static final float PI = 3.14f;

    public static float calcularVolume(float raio) {
        float volume = (float) ((4.0 / 3.0) * PI * Math.pow(raio, 3));
        return volume;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float raio, resultado;

        System.out.println("Digite o raio de uma esfera para calcular o seu volume: ");
        raio = scanner.nextFloat();

        resultado = calcularVolume(raio);
        System.out.println(resultado);
        
        scanner.close();
    }
}
