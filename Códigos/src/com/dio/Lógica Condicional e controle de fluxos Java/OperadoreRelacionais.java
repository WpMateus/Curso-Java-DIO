package br.com.dio;

/* Exercicio
 * 
 * Criar um simples projeto na ide para realizar comparações dos slides anterior, além de utilizar os demais tipos de dados não apresentados*/

public class OperadoreRelacionais {

	public static void main(String[] args) {

		int i1 = 10;
		int i2 = 20;
		float f1 = 4.5f;
		float f2 = 3.5f;
		double d1 = 59.6d;
		char c1 = 'x';
		char c2 = 'y';
		String s1 = "Fulano";
		String s2 = "Fulano";
		String s3 = "Cicrano";
		boolean b1 = true;
		boolean b2 = false;

		long l1 = 1597L;
		long l2 = 8997L;
		byte y1 = 1;
		short h1 = 25;

		System.out.println("i1 == i2 " + (i1 == i2)); // igual
		System.out.println("i1 != i2 " + (i1 != i2)); // diferente
		System.out.println("i1 > i2 " + (i1 > i2)); // maior
		System.out.println("i1 <= i2 " + (i1 <= i2)); // menor igual

		System.out.println("f1 == f2 " + (f1 == f2)); // igual
		System.out.println("f1 != f2 " + (f1 != f2)); // diferente
		System.out.println("f1 >= f2 " + (f1 >= f2)); // maior igual
		System.out.println("f1 < f2 " + (f1 < f2)); // menor

		System.out.println("c1 == c2 " + (c1 == c2)); // igual
		System.out.println("c1 != c2 " + (c1 != c2)); // diferente
		System.out.println("c1 > c2 " + (c1 > c2)); // maior
		System.out.println("c1 <= c2 " + (c1 <= c2)); // menor igual

		// Dão erro

		System.out.println("s1 == s2 " + (s1 == s2));
		System.out.println("s1 == s3 " + (s1 == s3));
		System.out.println("s1 != s2 " + (s1 != s2));
		// System.out.println(s1 >= s2);
		// System.out.println(s1 < s2);

		System.out.println("b1 == b2 " + (b1 == b2)); // de similaridade foi
		System.out.println("b1 != b2 " + (b1 != b2));
		// System.out.println(b1 >= b2); // mas de tamanho não da certo
		// System.out.println(b1 <= i1);

		// System.out.println(s2 >= c1); // char é um código numérico
		// System.out.println(s3 <= i1);

		System.out.println("l1 == i2 " + (l1 == i2)); // pode ser comparado long com int
		System.out.println("l2 == i1 " + (l2 == i1));
		System.out.println("y1 == h1 " + (y1 == h1)); // e byte com short, são diferentes, mas são numéricos

	}

}
