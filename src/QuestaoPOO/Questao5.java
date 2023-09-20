/*
 * Aluna: Diúle Guerra     Data: 20/09/23
Professor: Fábio

5.Faça um procedimento que recebe a idade de um nadador por parâmetro e imprime
a categoria desse nadador de acordo com a tabela abaixo: Chame atenção do 
usuário em caso de uma consulta inválida, ou seja, com números menores ou 
iguais a zero, ou maiores do que a quantidade cadastrada.

Idade		 Categoria 
5 a 7 anos 	Infantil A 
8 a 10 anos 	Infantil B 
11-13 anos 	Juvenil A 
14-17 anos 	Juvenil B 
Maiores de 	18 anos (inclusive) Adulto
 

 */
package QuestaoPOO;

import java.util.Scanner;

public class Questao5 {
    
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do nadador: ");
        int idade = scanner.nextInt();

        verificarCategoria(idade);

        scanner.close();
    }

    public static void verificarCategoria(int idade){
        if (idade >=5 && idade <=7){
            System.out.println("Categoria: Infantil A");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Categoria: Infantil B");
        } else if (idade >=11 && idade <=13){
            System.out.println("Categoria: Juvenil A");
        } else if (idade >=14 && idade <= 17){
            System.out.println("Categoria: Juvenil B");
        } else if (idade >= 18){
            System.out.println("Categoria: Adulto");
        } else {
            System.out.println("Idade inválida. A idade deve ser maior que zero.");;
        }
    }
}
