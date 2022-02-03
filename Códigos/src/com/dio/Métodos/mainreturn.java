package com.dio;

// Professor Thiago Leite
// Github: (https://github.com/tlcdio)

public class mainreturn {

	public static void main(String[] args) {
		// Retornos
		// Os valores foram guardados em variáveis
		System.out.println("Exemplo retorno do quadrilátero");

		double areaQuadrado = RetornoQuadrilateros.area(3);
		System.out.println("Área do quadrado: " + areaQuadrado);

		double areaRetangulo = RetornoQuadrilateros.area(5, 5);
		System.out.println("Área do retângulo: " + areaRetangulo);

		double areaTrapezio = RetornoQuadrilateros.area(7, 8, 9);
		System.out.println("Área do trapézio: " + areaTrapezio);
	}

}
