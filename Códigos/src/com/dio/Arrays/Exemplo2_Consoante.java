package Arrays;

import java.util.Scanner;

/*Leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas.
 * Imprima as consoantes
 * Camila Cavalcante -  DIO*/
public class Exemplo2_Consoante {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// array de string, essa posição vai ficar marcada como null, irá morrer com o
		// mesmo tamanho, tendo ou não elementos
		String[] consoantes = new String[6];

		// variável para indicar quantas consoantes foram lidas
		int quantidadeConsoantes = 0;

		// laço para treinar do-while
		int contador = 0;
		do {
			// criar o laço
			System.out.println("Letra: ");
			String letra = scan.next();

			// lógica para saber o que é consoante e vogal. // ignore case, compara com a
			// outra e se for true retorna true, não vai se atentar se for maiuscula ou
			// minuscula
			if (!(letra.equalsIgnoreCase("a") | 
					letra.equalsIgnoreCase("e") | 
					letra.equalsIgnoreCase("i") | 
					letra.equalsIgnoreCase("o") | 
					letra.equalsIgnoreCase("u"))) {
				consoantes[contador] = letra;
				quantidadeConsoantes++;
			}

			contador++;

		} while (contador < consoantes.length); // informe quando vai parar

		// laço foreach, é um for que vai abrir e fechar parentese e vai colocar dois
		// pontos no meio, do lado esquerdo o pico do elemento e do direito o array
		
		System.out.println("Consoantes: ");
		for (String consoante : consoantes) {// para cada elemento dentro desse array, quero que você imprima esse
			if(consoante != null)								// elemento.
			System.out.println(consoante + " ");
		}
		System.out.println("Quantidade de consoante: " + quantidadeConsoantes);
		System.out.println(consoantes.length);
	}

}
