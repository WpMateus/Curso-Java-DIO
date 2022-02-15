package Repetição;

import java.util.Scanner;

/*Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuári
 * Ex: 5! = 120 (5x4x3x2x1)*/

public class Exemplo6_Fatorial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Fatorial: ");
		int fatorial = scan.nextInt();

		// Quando utilizar for, while e do-while
		// o for é usado quando precisa a última variável, aquela do contador
		// quando laços infinitos, while (true).
		// do-while executar aquele programa pelo menos uma vez antes de conferir a
		// sentença true ou false

		int multiplicacao = 1;
		
		
		 System.out.println(fatorial +"! = ");
		for (int i = fatorial; i >= 1; i--) {
			multiplicacao = multiplicacao * i;
		}
		
		System.out.println(multiplicacao);
	}

}
