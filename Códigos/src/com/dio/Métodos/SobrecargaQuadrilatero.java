package com.dio;
//Professor Thiago Leite

//Github: (https://github.com/tlcdio)

// Criar uma aplica��o que calcula a �rea dos 3 quadril�teros not�veis: quadrado, ret�ngulo e trap�zio.
// Deve se usar sobrecarga.

public class SobrecargaQuadrilatero {
// temos 3 sobrecarga para o m�todo area para calcular a area
	public static void area(double lado) {
		// o quadrado � lado vezes lado, os 4 lados iguais, apenas necessita um lado
		System.out.println("�rea do quadrado: " + lado * lado);
	}

	public static void area(double lado1, double lado2) {
		// os lados n�o s�o iguais, s�o iguais aos pares, dois s�o iguais e os outros
		// dois s�o iguais
		System.out.println("�rea do ret�ngulo: " + lado1 * lado2);
	}

	public static void area(double baseMaior, double baseMenor, double altura) {
		// s�o 3 informa��es, pois n�o s�o lados iguais.
		System.out.println("�rea do trap�zio: " + ((baseMaior + baseMenor) * altura) / 2);
	}
	// acrescentar uma nova �rea. Aparece um erro, da erro pelo tipo de dado do
	// par�metro, para resolver public static void area(double diagonal1, double
	// diagonal2) isso � s� passar o float, havendo uma mudan�a um pouco maior

	public static void area(float diagonal1, float diagonal2) {

		System.out.println("�rea do losango: " + (diagonal1 * diagonal2) / 2);
	}
}
