package Repeti��o;

import java.util.Scanner;

/* Desenvolva um gerador de tabuada
 * capaz de gerar a tabuada de qualquer n�mero inteiro entre 1 a 10
 * O usu�rio deve informar de qual n�mero ele deseja ver a tabuada
 * A sa�da deve ser conforme o exemplo abaixo
 * 
 * Tabuada do 5
 * 5x1 = 5
 * 5x2 = 10
 * 
 *...
 *
 *5x10 = 50*/

public class Exemplo5_Tabuada {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Tabuada: ");
		int tabuada = scan.nextInt();

		System.out.println("Tabuada de " + tabuada);
		// o i � como se fosse a vari�vel contador
		for (int i = 1; i <= 10; i++) { // como se fosse la�o while comprimido
			System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
		}
	}

}
