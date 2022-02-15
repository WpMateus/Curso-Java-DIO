package Repeti��o;

import java.util.Scanner;

/*
programa que leia 5 n�meros e informe o maior n�mero e a m�dia desses n�meros*/
public class Exemplo3_MaiorEMedia {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero;
		int maior = 0; // armazenar o valor maior
		int soma = 0;
		int contador = 0; // vari�vel contador para auxiliar na contagem do n�mero

		do {
			System.out.println("N�mero: ");
			numero = scan.nextInt(); // pede o n�mero e ser� armazenado na vari�vel numero
			contador = contador + 1; // e vai contar o contador, se for menor que 5 para

			soma = soma + numero;

			if (numero > maior)
				maior = numero; // se o numero for maior que a vari�vel maior, a vari�vel tenha o mesmo valor
								// que a vari�vel n�mero.

			// System.out.println("Maior: " + maior);
		} while (contador < 5); // Contador tem que ser menor que 5

		System.out.println("Maior: " + maior);// Caso queira ver o maior n�mero, deve colocar dentro de if e ir�
// imprimir toda vez que inserir um numero maior

		System.out.println("M�dia: " + soma / 5);
	}

}
