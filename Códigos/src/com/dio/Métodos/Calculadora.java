package com.dio;
//Professor Thiago Leite
//Github: (https://github.com/tlcdio)

public class Calculadora {

	// Primeiro exercicio da aula 1 de métodos.

	// método soma que recebe como parâmetro dois números reais que devem ser
	// somados e printando um resultado. ele é public é static e é void, pois não
	// haverá retorno
	public static void soma(double numero1, double numero2) {
		// armazena na variavel resultado a soma dos números
		double resultado = numero1 + numero2;

		System.out.println("A soma de " + numero1 + " mais " + numero2 + " é " + resultado);
	}

	// mesma coisa da soma
	public static void subtracao(double numero1, double numero2) {
// o static que possibilita chamar o método dentro da classe
		double resultado = numero1 - numero2;
		System.out.println("A subtração de " + numero1 + " menos " + numero2 + " é " + resultado);
	}

	public static void multiplicacao(double numero1, double numero2) {

		double resultado = numero1 * numero2;
		System.out.println("A multiplicação de " + numero1 + " vezes " + numero2 + " é " + resultado);
	}

	public static void divisao(double numero1, double numero2) {

		double resultado = numero1 / numero2;
		System.out.println("A divisão de " + numero1 + " dividio " + numero2 + " é " + resultado);

	}

}
