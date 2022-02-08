package br.com.dio;

/*Exercicio
 * Criar variáveis e expressões para usar nas estruturas if e switch
 * 
 * Com if, exiba o nome do mês do ano de acordo com seu numero. Evite o efeito "flecha". Faça também outro if que verifique se o mês é julho, dezembro ou janeiro, para assim exibir o texto "férias".
 *
 * Com switch use String para a partir do dia da semana, exibir seu número. Ainda no switch, faça outro exemplo onde, se uma variável inteira for entre 1 e 3 exibir o texto "Certo". Se for 4 exibir "Errado", se for 5 "Talvez". Pra demais valores exibir "Valor indefinido"
 * */
public class ControleFluxo {

	public static void main(String[] args) {

		ifFlecha();
		ifSemFlecha();
		ifFerias();
		ifMenor();

		switchSemana();
		switchNumero();
		switchFerias();

	}

// evitar, o comportamento padrão deve ser usado, para informar que algo inesperado aconteceu
	private static void ifFlecha() {
		int mes = 9;
		if (mes == 1) {
			System.out.println("Janeiro");
		} else {
			if (mes == 2) {
				System.out.println("Fevereiro");
			} else {
				if (mes == 3) {
					System.out.println("Março");
				} else {
					if (mes == 4) {
						System.out.println("Abril");
					} else {
						if (mes == 5) {
							System.out.println("Maio");
						} else {
							if (mes == 6) {
								System.out.println("Junho");
							} else {
								if (mes == 7) {
									System.out.println("Julho");
								} else {
									if (mes == 8) {
										System.out.println("Agosto");
									} else {
										if (mes == 9) {
											System.out.println("Setembro");
										} else {
											if (mes == 10) {
												System.out.println("Outubro");
											} else {
												if (mes == 11) {
													System.out.println("Novembro");
												} else {
													if (mes == 12) {
														System.out.println("Dezembro");
													} else {
														System.out.println("Mês indefinido");
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

// sem efeito flecha todos alinhados a esquerda, evitando o efeito flecha.

	private static void ifSemFlecha() {

		int mes = 9;
		if (mes == 1) {
			System.out.println("Janeiro");
		} else if (mes == 2) {
			System.out.println("Fevereiro");
		} else if (mes == 3) {
			System.out.println("Março");
		} else if (mes == 4) {
			System.out.println("Abril");
		} else if (mes == 5) {
			System.out.println("Maio");
		} else if (mes == 6) {
			System.out.println("Junho");
		} else if (mes == 7) {
			System.out.println("Julho");
		} else if (mes == 8) {
			System.out.println("Agosto");
		} else if (mes == 9) {
			System.out.println("Setembro");
		} else if (mes == 10) {
			System.out.println("Outubro");
		} else if (mes == 11) {
			System.out.println("Novembro");
		} else {
			System.out.println("Dezembro");
		} // else if (mes == 12) {
			// System.out.println("Dezembro");
			// } else{
			// } System.out.println("Não definido");

	}

	// o que não deve ser feito com o if e nesse caso deveria ter usado o switch,
	// pois temos uma variável que está sendo analisada
	private static void ifFerias() {
		String mes = "Julho";
		if (mes == "Julho" || mes == "Dezembro" || mes == "Janeiro") {
			System.out.println("Férias");
		}
	}

// se envolve apenas uma variável, use o switch

// melhorar os if's, ao invés de ter expressões muito grandes, cria variáveis intermediárias para diminuir o if. Quanto maior você ver que seu if vai ficar, crie variáveis intermediárias para simplificar seu código

	private static void ifMenor() {

		double salarioMensal = 11893.58d;
		double mediaSalario = 10500d;

		int quantidadeDependentes = 4;
		int mediaDependentes = 2;

		if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
			System.out.println("Funcionário deve receber auxilio.");
		}

		boolean salarioBaixo = salarioMensal < mediaSalario;
		boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

		if ((salarioBaixo) && (muitosDependentes)) {
			System.out.println("Funcionário deve receber auxilio.");
		}

		boolean receberAuxilio = (salarioBaixo) && (muitosDependentes);
		if (receberAuxilio) {
			System.out.println("Funcionário deve receber auxilio.");
		} else {
			System.out.println("Funcionário não deve receber auxilio.");
		}

	}

	// dado o nome da semana, informe o número, apenas uma variável envolvida, com
	// if não ficaria em boas práticas, está testando apenas uma variável.
	private static void switchSemana() {

		String dia = "Terça";
		switch (dia) {
		case "Segunda":
			System.out.println("2");
			break;
		case "Terça":
			System.out.println("3");
			break;
		case "Quarta":
			System.out.println("4");
			break;
		case "Quinta":
			System.out.println("5");
			break;
		case "Sexta":
			System.out.println("6");
			break;
		case "Sábado":
			System.out.println("7");
			break;
		// case "Domingo":
		// System.out.println("1");
		// break;
		default:
			// System.out.println("1");
			System.out.println("Dia inválido");

		}
	}

	// mostrar que nosso teste englobe mais de um valor para dar uma resposta. Neste caso não quero que interrompa enquanto for 1,2,3 apenas a partir do 4
	private static void switchNumero() {

		int numero = 4;
		switch (numero) {
		case 1:
		case 2:
		case 3:
			System.out.println("Certo");
			break;
		case 4:
			System.out.println("Errado");
			break;
		case 5:
			System.out.println("Talvez");
			break;
		default:
			System.out.println("Valor Indefinido");
			break;
		}

	}
	
	// se for dezembro, julho ou janeiro, estamos de férias, se não for, não estamos.
	private static void switchFerias() {
		
		String mes = "dezembro";
		switch (mes) {
		case "dezembro":
		case "julho":
		case "janeiro":
			System.out.println("Férias");
			break;
			default:
				System.out.println("Mês indefinido");
				break;
		
		}
		
	}

}
