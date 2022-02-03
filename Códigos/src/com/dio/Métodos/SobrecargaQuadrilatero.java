package com.dio;
//Professor Thiago Leite

//Github: (https://github.com/tlcdio)

// Criar uma aplicação que calcula a área dos 3 quadriláteros notáveis: quadrado, retângulo e trapézio.
// Deve se usar sobrecarga.

public class SobrecargaQuadrilatero {
// temos 3 sobrecarga para o método area para calcular a area
	public static void area(double lado) {
		// o quadrado é lado vezes lado, os 4 lados iguais, apenas necessita um lado
		System.out.println("Área do quadrado: " + lado * lado);
	}

	public static void area(double lado1, double lado2) {
		// os lados não são iguais, são iguais aos pares, dois são iguais e os outros
		// dois são iguais
		System.out.println("Área do retângulo: " + lado1 * lado2);
	}

	public static void area(double baseMaior, double baseMenor, double altura) {
		// são 3 informações, pois não são lados iguais.
		System.out.println("Área do trapézio: " + ((baseMaior + baseMenor) * altura) / 2);
	}
	// acrescentar uma nova área. Aparece um erro, da erro pelo tipo de dado do
	// parâmetro, para resolver public static void area(double diagonal1, double
	// diagonal2) isso é só passar o float, havendo uma mudança um pouco maior

	public static void area(float diagonal1, float diagonal2) {

		System.out.println("Área do losango: " + (diagonal1 * diagonal2) / 2);
	}
}
