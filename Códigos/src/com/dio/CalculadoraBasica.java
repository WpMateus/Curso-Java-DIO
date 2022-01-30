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
	
		
		// erro na divisão, necessário usar o debug e arrumar para double para o resultado sair com casa depois da vírgula
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println("A soma dos números são: " + soma);
		System.out.println("A subtração dos números são: " + subtracao);
		System.out.println("A multiplicação dos números são: " + multiplicacao);
		System.out.println("A divisao dos números são: " + divisao);
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