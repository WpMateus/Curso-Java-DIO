package com.dio;

public class MainSobrecarga {

	// Professor Thiago Leite
	// Github: (https://github.com/tlcdio)

	// Criar uma aplica��o que calcula a �rea dos 3 quadril�teros not�veis:
	// quadrado, ret�ngulo e trap�zio.
	// Deve se usar sobrecarga.

	public static void main(String[] args) {
// Quadril�tero
		System.out.println("Quadril�tero");
		SobrecargaQuadrilatero.area(3);
		SobrecargaQuadrilatero.area(5d, 5d);
		SobrecargaQuadrilatero.area(7, 8, 9);
		SobrecargaQuadrilatero.area(5f, 5f);

		// para a classe area, de acordo com a quantidade de par�metros que informarmos
		// a linguagem Java vai conseguir determinar qual �rea desejamos.
		// um n�mero � o quadrado, dois � o ret�ngulo e tr�s n�meros � do trap�zio.
		
		// quando passamos os dois double ele conheceu que era double e quando passou os dois floats ele reconheceu tamb�m. 
	}

}
