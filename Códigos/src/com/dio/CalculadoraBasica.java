package com.dio;

import java.util.Scanner;

public class CalculadoraBasica {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
	
		
		// erro na divis�o, necess�rio usar o debug e arrumar para double para o resultado sair com casa depois da v�rgula
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println("A soma dos n�meros s�o: " + soma);
		System.out.println("A subtra��o dos n�meros s�o: " + subtracao);
		System.out.println("A multiplica��o dos n�meros s�o: " + multiplicacao);
		System.out.println("A divisao dos n�meros s�o: " + divisao);
	}

	public static int soma (int a,int b) {
		return a + b;
	}
	public static int subtracao (int a, int b) {
		return a - b;
	}
	public static double divisao (double a, double b) {
		return ((double) a / b);
	}
	public static int multiplicacao (int a,int b) {
		return a * b;
	}

	
}