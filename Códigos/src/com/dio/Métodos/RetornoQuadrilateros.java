package com.dio;

//Professor Thiago Leite
// Github: (https://github.com/tlcdio)

// Recrie a aplica��o que calcula a �rea dos 3 quadril�teros not�veis. Agora fa�a os m�todos retornarem valores.

public class RetornoQuadrilateros {
// quadrado
	public static double area(double lado) {

		return lado * lado;
	}

// Ret�ngulo
	public static double area(double lado1, double lado2) {

		return lado1 * lado2;
	}

// Trap�zio
	public static double area(double baseMaior, double baseMenor, double altura) {

		return ((baseMaior + baseMenor) * altura) / 2;
	}

	// falta uma logica para usar o return, sendo um if
	/*
	 * public static void xpto() { System.out.println("Antes"); return; }
	 */

	// aqui da erro porque declara long e coloca um double, o m�todo foi definido
	// para retornar long e n�o double
	/*
	 * public static long abc() { return 1.6; }
	 */
}
