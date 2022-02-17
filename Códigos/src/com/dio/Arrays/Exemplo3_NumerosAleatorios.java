package Arrays;

import java.util.Random;

/*
 * Faça um programa que leia 20 números inteiros aleatórios (entre 0 a 100)
 * armazene-os num vetor, ao final mostre os números e seus sucessores
 */


public class Exemplo3_NumerosAleatorios {

	
	public static void main(String[] args) {

		// random, gera números aleatórios
		Random random = new Random(); // classe para gerar números aleatórios

		// até quanto podemos gerar esses números
		int[] numerosAleatorios = new int[20]; // pode declarar o colchete depois do int ou depois do numerosAleatorios

		for (int i = 0; 1 < numerosAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		
		System.out.println("Números aleatórios: ");
		for (int numero : numerosAleatorios) {
			System.out.print(numero + " ");
		}
		
		System.out.println("\nSucessores dos números aleatórios: ");
		for (int numero : numerosAleatorios) {
			System.out.print((numero + 1) + " ");

		}
		
		System.out.println("\nAntecessor dos números aleatórios: ");
		for (int numero : numerosAleatorios) {
			System.out.print((numero - 1) + " ");
		}
	}
}
