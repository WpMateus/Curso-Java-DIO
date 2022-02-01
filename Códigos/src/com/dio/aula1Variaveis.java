package com.dio;

public class aula1Variaveis {

	public static void main(String[] args) {
	
		int i;
		// int i; -  não deve ter o mesmo nome
		int I; //completamente diferente do i minúsculo
		// int 1a; inválida pois começa com número
		int _1a; // Não se aplica boas práticas e não da erro de compilação
		int $aq; // Não se aplica boas práticas
		
		// variáveis dentro de métodos sempre deve ser inicializada, deve ser provido seu valor inicial
		i = 5;
		I = 10;
		_1a =  20;
		$aq = 7;
		
		// variável final, final é uma variável constante.
		final int j = 10;
		// j = 15; não possível alterar o valor
		int asrn224466md;
		// int asrn 113355 77md; não pode dar espaço
		int asrn112233344_md = 10; // não é boas práticas
		// int ashr122343434%_md = 10; não pode ter caracteres especiais.
		
		asrn224466md = 100;
		asrn112233344_md = 10;
		
		// expressividade dos nomes
		int quantidadeProduto = 50;
		int QuantidadeProduto; // não segue as boas práticas mas segue a conotação camelo
		final int NUMERO_TENTATIVAS = 5; // Regra de exceção para final
		// final int numeroTentativas = 5; // Sem regras de boa práticas do final. Não da erro mas deve ser evitado.
		int QUANTIDADE_OPCOES = 25; // não está seguindo boas práticas e não irá gerar erro.
		// int qtdProd; segue a boa pratica de notação camelo e não foi aplicada a expressividade
		
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
