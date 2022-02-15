package Repetição;

import java.util.Scanner;

/*
programa que leia 5 números e informe o maior número e a média desses números*/
public class Exemplo3_MaiorEMedia {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero;
		int maior = 0; // armazenar o valor maior
		int soma = 0;
		int contador = 0; // variável contador para auxiliar na contagem do número

		do {
			System.out.println("Número: ");
			numero = scan.nextInt(); // pede o número e será armazenado na variável numero
			contador = contador + 1; // e vai contar o contador, se for menor que 5 para

			soma = soma + numero;

			if (numero > maior)
				maior = numero; // se o numero for maior que a variável maior, a variável tenha o mesmo valor
								// que a variável número.

			// System.out.println("Maior: " + maior);
		} while (contador < 5); // Contador tem que ser menor que 5

		System.out.println("Maior: " + maior);// Caso queira ver o maior número, deve colocar dentro de if e irá
// imprimir toda vez que inserir um numero maior

		System.out.println("Média: " + soma / 5);
	}

}
