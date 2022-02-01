package com.dio;

//Professor Thiago Leite
//Github: (https://github.com/tlcdio)

public class Emprestimo {

	public static int getDuasParcelas() {
		return 2;
	}

	public static int getTresParcelas() {
		return 3;
	}

	public static double getTaxaDuasParcelas() {
		return 0.3;
	}

	public static double getTaxaTresParcelas() {
		return 0.45;
	}

	// m�todo principal � o que calcula. Para ele calcular, precisa do valor de
	// entrada e o n�mero de parcelas, � comum ter tipo de dados diferentes
	public static void calcular(double valor, int parcelas) {
		// se for duas parcelas, fa�a isso pega o valor e multiplica pela taxa de duas
		// parcelas e printa o valor
		if (parcelas == 2) {
			double valorFinal = valor + (valor * getTaxaDuasParcelas());
			System.out.println("Valor final do empr�stimo para 2 parcelas: R$ " + valorFinal);

		} else if (parcelas == 3) {
			// se n�o for 2 e for 3 pega o valor multiplica e mostra o valor
			double valorFinal = valor + (valor * getTaxaTresParcelas());

			System.out.println("Valor final do empr�stimo para 3 parcelas: R$ " + valorFinal);
		} else {
			System.out.println("Quantidade de parcelas n�o aceita.");

		}

	}

}
