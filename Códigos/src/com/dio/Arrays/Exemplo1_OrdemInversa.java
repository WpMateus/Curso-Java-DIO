package Arrays;

/* Crie um vetor de 6 números inteiros
 * e mostre na ordem inversa
 * Ministrador por Camila Cavalcante*/
public class Exemplo1_OrdemInversa {

	public static void main(String[] args) {
// esse array tem apenas uma linha

		int[] vetor = { 4, 6, 9, 50, -15, 18 };

		System.out.println("Vetor: ");
		int contador = 0;
		while (contador < (vetor.length)) {
			System.out.println(vetor[contador] + " "); // quando o contador for 0 vai mostra o número 4, até o contador
														// for menor que o vetor.length
			contador++;
		}

		System.out.println("\nVetor: ");
		for (int i = (vetor.length - 1); i >= 0; i--) {
			System.out.println(vetor[i] + " ");
		}

	}

}
