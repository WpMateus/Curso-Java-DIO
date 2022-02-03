package com.dio;

//Professor Thiago Leite
//Github: (https://github.com/tlcdio)

public class Mensagem {

	
	// novamente é public, static e void, o nome e o parâmetro
	public static void obterMensagem(int hora) {
		
		switch (hora) {
		// se for de 5 da manhã até 12 horas é bom dia.
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			mensagemBomDia();
			break;
			//se for das 13 as 17 é boa tarde
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
			mensagemBoaTarde();
			break;
			// se for das 18 as 4 da manhã é boa noite
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			mensagemBoaNoite();
			break;
		default:
			System.out.println("Hora inválida");
			break;
	
		}
		
	
	}
	
	public static void mensagemBomDia() {
		System.out.println("Bom dia");
	}
	
	public static void mensagemBoaTarde() {
		System.out.println("Boa tarde");
	}
	public static void mensagemBoaNoite() {
		System.out.println("Boa noite");
	}
}
