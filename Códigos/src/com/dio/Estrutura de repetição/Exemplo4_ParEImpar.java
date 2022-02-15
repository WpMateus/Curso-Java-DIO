package Repetição;

import java.util.Scanner;

/* Faça um programa que peça N números inteiros,
 * calcule e mostrea quantidade de números pares
 * e a quantidade de números impares*/

public class Exemplo4_ParEImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int quantNumeros;
		int numero;
		int quantPares = 0, quantImpares = 0;

		System.out.println("Quantidade de números: ");
		quantNumeros = scan.nextInt();

		int contador = 0;
		// laço
		do {
			System.out.println("Número: ");
			numero = scan.nextInt();
			// colocar no do o if para salvar e mostrar impar ou par
			if (numero % 2 == 0) quantPares++; // se o resto for 2 ou igual a 0 é par, se não é impar
			// quantiPares = quantPares + 1;
			else quantImpares++; // se não for verdade, vai ser impares
			
			contador++; // mais simples de usar / se não colocar, fica infinito
			// contador = contador + 1;
		} while (contador < quantNumeros); // Contador tem que ser menor que a quantidade de números informados

		System.out.println("Quantidade Par: " + quantPares);
		System.out.println("Quantidade Impar: " + quantImpares);
	}

}
