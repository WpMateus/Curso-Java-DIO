package Repeti��o;

import java.util.Scanner;

/* Fa�a um programa que pe�a N n�meros inteiros,
 * calcule e mostrea quantidade de n�meros pares
 * e a quantidade de n�meros impares*/

public class Exemplo4_ParEImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int quantNumeros;
		int numero;
		int quantPares = 0, quantImpares = 0;

		System.out.println("Quantidade de n�meros: ");
		quantNumeros = scan.nextInt();

		int contador = 0;
		// la�o
		do {
			System.out.println("N�mero: ");
			numero = scan.nextInt();
			// colocar no do o if para salvar e mostrar impar ou par
			if (numero % 2 == 0) quantPares++; // se o resto for 2 ou igual a 0 � par, se n�o � impar
			// quantiPares = quantPares + 1;
			else quantImpares++; // se n�o for verdade, vai ser impares
			
			contador++; // mais simples de usar / se n�o colocar, fica infinito
			// contador = contador + 1;
		} while (contador < quantNumeros); // Contador tem que ser menor que a quantidade de n�meros informados

		System.out.println("Quantidade Par: " + quantPares);
		System.out.println("Quantidade Impar: " + quantImpares);
	}

}
