package com.dio;

public class aula1Variaveis {

	public static void main(String[] args) {
	
		int i;
		// int i; -  n�o deve ter o mesmo nome
		int I; //completamente diferente do i min�sculo
		// int 1a; inv�lida pois come�a com n�mero
		int _1a; // N�o se aplica boas pr�ticas e n�o da erro de compila��o
		int $aq; // N�o se aplica boas pr�ticas
		
		// vari�veis dentro de m�todos sempre deve ser inicializada, deve ser provido seu valor inicial
		i = 5;
		I = 10;
		_1a =  20;
		$aq = 7;
		
		// vari�vel final, final � uma vari�vel constante.
		final int j = 10;
		// j = 15; n�o poss�vel alterar o valor
		int asrn224466md;
		// int asrn 113355 77md; n�o pode dar espa�o
		int asrn112233344_md = 10; // n�o � boas pr�ticas
		// int ashr122343434%_md = 10; n�o pode ter caracteres especiais.
		
		asrn224466md = 100;
		asrn112233344_md = 10;
		
		// expressividade dos nomes
		int quantidadeProduto = 50;
		int QuantidadeProduto; // n�o segue as boas pr�ticas mas segue a conota��o camelo
		final int NUMERO_TENTATIVAS = 5; // Regra de exce��o para final
		// final int numeroTentativas = 5; // Sem regras de boa pr�ticas do final. N�o da erro mas deve ser evitado.
		int QUANTIDADE_OPCOES = 25; // n�o est� seguindo boas pr�ticas e n�o ir� gerar erro.
		// int qtdProd; segue a boa pratica de nota��o camelo e n�o foi aplicada a expressividade
		
		//mostrar no console
		System.out.println(i);
		System.out.println(I);
		System.out.println(_1a);
		System.out.println($aq);
		
		System.out.println(j);
		System.out.println(asrn224466md);
		System.out.println(asrn112233344_md);
		
		System.out.println(quantidadeProduto);
		System.out.println(NUMERO_TENTATIVAS);
		System.out.println(QUANTIDADE_OPCOES);
		
		
	}

}
