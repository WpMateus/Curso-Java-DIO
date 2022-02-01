package com.dio;
//Professor Thiago Leite
//Github: (https://github.com/tlcdio)

public class Calculadora {

	// Primeiro exercicio da aula 1 de m�todos.

	// m�todo soma que recebe como par�metro dois n�meros reais que devem ser
	// somados e printando um resultado. ele � public � static e � void, pois n�o
	// haver� retorno
	public static void soma(double numero1, double numero2) {
		// armazena na variavel resultado a soma dos n�meros
		double resultado = numero1 + numero2;

		System.out.println("A soma de " + numero1 + " mais " + numero2 + " � " + resultado);
	}

	// mesma coisa da soma
	public static void subtracao(double numero1, double numero2) {
// o static que possibilita chamar o m�todo dentro da classe
		double resultado = numero1 - numero2;
		System.out.println("A subtra��o de " + numero1 + " menos " + numero2 + " � " + resultado);
	}

	public static void multiplicacao(double numero1, double numero2) {

		double resultado = numero1 * numero2;
		System.out.println("A multiplica��o de " + numero1 + " vezes " + numero2 + " � " + resultado);
	}

	public static void divisao(double numero1, double numero2) {

		double resultado = numero1 / numero2;
		System.out.println("A divis�o de " + numero1 + " dividio " + numero2 + " � " + resultado);

	}

}
