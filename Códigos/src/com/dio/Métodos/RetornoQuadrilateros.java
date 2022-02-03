package com.dio;

//Professor Thiago Leite
// Github: (https://github.com/tlcdio)

// Recrie a aplicação que calcula a área dos 3 quadriláteros notáveis. Agora faça os métodos retornarem valores.

public class RetornoQuadrilateros {
// quadrado
	public static double area(double lado) {

		return lado * lado;
	}

// Retângulo
	public static double area(double lado1, double lado2) {

		return lado1 * lado2;
	}

// Trapézio
	public static double area(double baseMaior, double baseMenor, double altura) {

		return ((baseMaior + baseMenor) * altura) / 2;
	}

	// falta uma logica para usar o return, sendo um if
	/*
	 * public static void xpto() { System.out.println("Antes"); return; }
	 */

	// aqui da erro porque declara long e coloca um double, o método foi definido
	// para retornar long e não double
	/*
	 * public static long abc() { return 1.6; }
	 */
}
