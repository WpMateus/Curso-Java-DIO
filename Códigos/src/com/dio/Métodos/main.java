package com.dio;

//Professor Thiago Leite
// Github: (https://github.com/tlcdio)

public class main {
	/**
	 * exercicio Criar uma aplica��o que resolva as seguintes situa��es: - Calcule
	 * as 4 opera��es b�sicas: soma, subtra��o, multiplica��o e deivis�o. Sempre 2
	 * valores devem ser passados. - A partir da hora do dia, informe a mensagem
	 * adequada: Bom dia, Boa tarde e Boa noite. - Calcule o valor final de um
	 * empr�stimo, a partir do valor solicitado. Taxas e parcelas influenciam.
	 * Defina arbitrariamente as faixas que influenciam nos valores.
	 * 
	 * Obs: Tente ao m�ximo criar m�todos que trabalhem sozinhos ou em conjunto Pode
	 * chamar um m�todo dentro de outro Pode passar como par�mentro, a chamada de um
	 * outro m�todo.
	 **/
// aqui vai ser onde vai ser executado so programas

	// est� separado em classes
	public static void main(String[] args) {
		// utilizando nosso m�todo
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
		System.out.println("Empr�stimos");
		// comum dentro de um m�todo chamar outro m�todo com par�metro o que o ultimo
		// passar ele vai passar como par�metro para o primeiro
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(1000, 5);

	}

}
