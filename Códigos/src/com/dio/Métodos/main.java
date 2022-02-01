package com.dio;

//Professor Thiago Leite
// Github: (https://github.com/tlcdio)

public class main {
	/**
	 * exercicio Criar uma aplicação que resolva as seguintes situações: - Calcule
	 * as 4 operações básicas: soma, subtração, multiplicação e deivisão. Sempre 2
	 * valores devem ser passados. - A partir da hora do dia, informe a mensagem
	 * adequada: Bom dia, Boa tarde e Boa noite. - Calcule o valor final de um
	 * empréstimo, a partir do valor solicitado. Taxas e parcelas influenciam.
	 * Defina arbitrariamente as faixas que influenciam nos valores.
	 * 
	 * Obs: Tente ao máximo criar métodos que trabalhem sozinhos ou em conjunto Pode
	 * chamar um método dentro de outro Pode passar como parâmentro, a chamada de um
	 * outro método.
	 **/
// aqui vai ser onde vai ser executado so programas

	// está separado em classes
	public static void main(String[] args) {
		// utilizando nosso método
		// Calculadora
		System.out.println("Calculadora");
		Calculadora.soma(3, 6);
		Calculadora.subtracao(9, 1.8);
		Calculadora.multiplicacao(7, 8);
		Calculadora.divisao(5, 2.5);

		// Mensagem de Bom dia, boa tarde e boa noite
		System.out.println("Mensagem");
		Mensagem.obterMensagem(9);
		Mensagem.obterMensagem(14);
		Mensagem.obterMensagem(1);

		// Emprestimo
		System.out.println("Empréstimos");
		// comum dentro de um método chamar outro método com parâmetro o que o ultimo
		// passar ele vai passar como parâmetro para o primeiro
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(1000, 5);

	}

}
