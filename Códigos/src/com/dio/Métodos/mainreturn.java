package com.dio;

// Professor Thiago Leite
// Github: (https://github.com/tlcdio)

public class mainreturn {

	public static void main(String[] args) {
		// Retornos
		// Os valores foram guardados em vari�veis
		System.out.println("Exemplo retorno do quadril�tero");

		double areaQuadrado = RetornoQuadrilateros.area(3);
		System.out.println("�rea do quadrado: " + areaQuadrado);

		double areaRetangulo = RetornoQuadrilateros.area(5, 5);
		System.out.println("�rea do ret�ngulo: " + areaRetangulo);

		double areaTrapezio = RetornoQuadrilateros.area(7, 8, 9);
		System.out.println("�rea do trap�zio: " + areaTrapezio);
	}

}
