package com.dio;

public class MainSobrecarga {

	// Professor Thiago Leite
	// Github: (https://github.com/tlcdio)

	// Criar uma aplicação que calcula a área dos 3 quadriláteros notáveis:
	// quadrado, retângulo e trapézio.
	// Deve se usar sobrecarga.

	public static void main(String[] args) {
// Quadrilátero
		System.out.println("Quadrilátero");
		SobrecargaQuadrilatero.area(3);
		SobrecargaQuadrilatero.area(5d, 5d);
		SobrecargaQuadrilatero.area(7, 8, 9);
		SobrecargaQuadrilatero.area(5f, 5f);

		// para a classe area, de acordo com a quantidade de parâmetros que informarmos
		// a linguagem Java vai conseguir determinar qual área desejamos.
		// um número é o quadrado, dois é o retângulo e três números é do trapézio.
		
		// quando passamos os dois double ele conheceu que era double e quando passou os dois floats ele reconheceu também. 
	}

}
