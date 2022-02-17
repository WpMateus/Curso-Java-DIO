package Arrays;

import java.util.Random;

/*
 * Fa�a um programa que leia 20 n�meros inteiros aleat�rios (entre 0 a 100)
 * armazene-os num vetor, ao final mostre os n�meros e seus sucessores
 */


public class Exemplo3_NumerosAleatorios {

	
	public static void main(String[] args) {

		// random, gera n�meros aleat�rios
		Random random = new Random(); // classe para gerar n�meros aleat�rios

		// at� quanto podemos gerar esses n�meros
		int[] numerosAleatorios = new int[20]; // pode declarar o colchete depois do int ou depois do numerosAleatorios

		for (int i = 0; 1 < numerosAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		
		System.out.println("N�meros aleat�rios: ");
		for (int numero : numerosAleatorios) {
			System.out.print(numero + " ");
		}
		
		System.out.println("\nSucessores dos n�meros aleat�rios: ");
		for (int numero : numerosAleatorios) {
			System.out.print((numero + 1) + " ");

		}
		
		System.out.println("\nAntecessor dos n�meros aleat�rios: ");
		for (int numero : numerosAleatorios) {
			System.out.print((numero - 1) + " ");
		}
	}
}
