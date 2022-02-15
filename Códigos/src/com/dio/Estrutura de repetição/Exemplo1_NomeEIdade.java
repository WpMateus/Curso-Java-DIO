package Repetição;

import java.util.Scanner;

/* Programa que leia conjuto de dois valores
o primeiro sendo o nome do aluno e o segundo sua idade.
(pare inserindo o valor 0 no campo nome)*/
public class Exemplo1_NomeEIdade {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // para ler através do teclado
		
		String nome;
		int idade;
		
		while(true) { // entre aspas deve ser true ou false

			System.out.println("Nome: ");
			nome = scan.next(); // Aparece o nome, é necessário adicionar o nome.
			if(nome.equals("0")) break; // equanto não coloca o 0 o laço não para
			
			System.out.println("Idade: ");
			idade = scan.nextInt(); // importa a idade para você inserir o valor.
			
		}
		
	System.out.println("Continua aqui...");
		
		
		
		
	}
}
