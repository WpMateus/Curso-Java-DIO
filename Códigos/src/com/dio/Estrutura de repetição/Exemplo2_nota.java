package Repeti��o;

import java.util.Scanner;

/*Programa que pe�a uma nota, entre zero e dez
Mostre uma mensagem caso o valor seja v�lido e continue pedindo at� que o usu�rio informe um valor v�lido*/
public class Exemplo2_nota {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int nota;

		System.out.println("Insira a nota: ");
		nota = scan.nextInt(); // pe�o a nota / se for entre 0 e 10 n�o vai entrar no while

		while (nota < 0 | nota > 10) { // se ela for menor que zero e maior que dez
			System.out.println("Nota inv�lida, Digite novamente: "); // retorna isso
			nota = scan.nextInt(); // pergunta a nota novamente

		}
	}

}
