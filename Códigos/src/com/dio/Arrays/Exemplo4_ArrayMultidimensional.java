package Arrays;

import java.util.Random;

/* Gere e imprima uma matriz M 4x4 com valorese aleatórios entre 0-9
 * Camila Cavalcante*/
public class Exemplo4_ArrayMultidimensional {

	public static void main(String[] args) {
		Random random = new Random();
		// primeira abertura de colchete representa a linha e a segunda a coluna
		int[][] M = new int[4][4];
		
		for(int i = 0; i < M.length; i++) {
			for( int j = 0; j < M.length; j++) {// j representa cada coluna dentro da linha i
				M[i][j] = random.nextInt(9);
			} 
			
		}
System.out.println("Matriz: ");
		for (int[] linha : M) {
			for (int coluna : linha) {
				System.out.print(coluna + " ");
			}
		}
	}

}
