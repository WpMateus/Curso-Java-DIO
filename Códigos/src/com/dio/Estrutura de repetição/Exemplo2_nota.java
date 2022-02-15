package Repetição;

import java.util.Scanner;

/*Programa que peça uma nota, entre zero e dez
Mostre uma mensagem caso o valor seja válido e continue pedindo até que o usuário informe um valor válido*/
public class Exemplo2_nota {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int nota;

		System.out.println("Insira a nota: ");
		nota = scan.nextInt(); // peço a nota / se for entre 0 e 10 não vai entrar no while

		while (nota < 0 | nota > 10) { // se ela for menor que zero e maior que dez
			System.out.println("Nota inválida, Digite novamente: "); // retorna isso
			nota = scan.nextInt(); // pergunta a nota novamente

		}
	}

}
