package br.com.dio;

/*Exercicio
 * Criar vari�veis e express�es para usar nas estruturas if e switch
 * 
 * Com if, exiba o nome do m�s do ano de acordo com seu numero. Evite o efeito "flecha". Fa�a tamb�m outro if que verifique se o m�s � julho, dezembro ou janeiro, para assim exibir o texto "f�rias".
 *
 * Com switch use String para a partir do dia da semana, exibir seu n�mero. Ainda no switch, fa�a outro exemplo onde, se uma vari�vel inteira for entre 1 e 3 exibir o texto "Certo". Se for 4 exibir "Errado", se for 5 "Talvez". Pra demais valores exibir "Valor indefinido"
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

// evitar, o comportamento padr�o deve ser usado, para informar que algo inesperado aconteceu
	private static void ifFlecha() {
		int mes = 9;
		if (mes == 1) {
			System.out.println("Janeiro");
		} else {
			if (mes == 2) {
				System.out.println("Fevereiro");
			} else {
				if (mes == 3) {
					System.out.println("Mar�o");
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
														System.out.println("M�s indefinido");
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
			System.out.println("Mar�o");
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
			// } System.out.println("N�o definido");

	}

	// o que n�o deve ser feito com o if e nesse caso deveria ter usado o switch,
	// pois temos uma vari�vel que est� sendo analisada
	private static void ifFerias() {
		String mes = "Julho";
		if (mes == "Julho" || mes == "Dezembro" || mes == "Janeiro") {
			System.out.println("F�rias");
		}
	}

// se envolve apenas uma vari�vel, use o switch

// melhorar os if's, ao inv�s de ter express�es muito grandes, cria vari�veis intermedi�rias para diminuir o if. Quanto maior voc� ver que seu if vai ficar, crie vari�veis intermedi�rias para simplificar seu c�digo

	private static void ifMenor() {

		double salarioMensal = 11893.58d;
		double mediaSalario = 10500d;

		int quantidadeDependentes = 4;
		int mediaDependentes = 2;

		if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
			System.out.println("Funcion�rio deve receber auxilio.");
		}

		boolean salarioBaixo = salarioMensal < mediaSalario;
		boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

		if ((salarioBaixo) && (muitosDependentes)) {
			System.out.println("Funcion�rio deve receber auxilio.");
		}

		boolean receberAuxilio = (salarioBaixo) && (muitosDependentes);
		if (receberAuxilio) {
			System.out.println("Funcion�rio deve receber auxilio.");
		} else {
			System.out.println("Funcion�rio n�o deve receber auxilio.");
		}

	}

	// dado o nome da semana, informe o n�mero, apenas uma vari�vel envolvida, com
	// if n�o ficaria em boas pr�ticas, est� testando apenas uma vari�vel.
	private static void switchSemana() {

		String dia = "Ter�a";
		switch (dia) {
		case "Segunda":
			System.out.println("2");
			break;
		case "Ter�a":
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
		case "S�bado":
			System.out.println("7");
			break;
		// case "Domingo":
		// System.out.println("1");
		// break;
		default:
			// System.out.println("1");
			System.out.println("Dia inv�lido");

		}
	}

	// mostrar que nosso teste englobe mais de um valor para dar uma resposta. Neste caso n�o quero que interrompa enquanto for 1,2,3 apenas a partir do 4
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
	
	// se for dezembro, julho ou janeiro, estamos de f�rias, se n�o for, n�o estamos.
	private static void switchFerias() {
		
		String mes = "dezembro";
		switch (mes) {
		case "dezembro":
		case "julho":
		case "janeiro":
			System.out.println("F�rias");
			break;
			default:
				System.out.println("M�s indefinido");
				break;
		
		}
		
	}

}
