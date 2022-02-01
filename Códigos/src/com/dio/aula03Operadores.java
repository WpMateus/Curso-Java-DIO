package com.dio;

public class aula03Operadores {

	public static void main(String[] args) {

		System.out.println("PrePos");
		prePos();
		System.out.println("Aritmético");
		aritmetico();
		System.out.println("Atribuição");
		atribuicao();
		System.out.println("Precedência");
		precedencia();
	}

	private static void prePos() {

		int k = 10;

		int i = ++k; // primeiro somar uma unidade e depois atribui ao i = 11
		int j = k--; // priemiro vai atribuir o k ao jota e depois subtrair + 11
		int x = k; // receberá o valor 10 do k = 10

		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println("x: " + x);
	}

	private static void aritmetico() {

		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;

		int r1 = a + b; // soma
		int r2 = c - a; // subtração
		int r3 = d * b; // multiplicação
		int r4 = e / a; // divisão
		int r5 = c % b;// resto da divisão

		System.out.println("a+b: " + r1);
		System.out.println("c-b: " + r2);
		System.out.println("d*b: " + r3);
		System.out.println("e/a: " + r4);
		System.out.println("c%b: " + r5);

	}

	private static void atribuicao() {

		int i = 1500;
		short j = 15;
		long l = 500L;
		int k = 35;
		float f = 3.5f;
		double d = f;

		System.out.println("d:" + d);

		// Atalho para fazer contas aritmeticas

		i += 5;// i = i + 5
		j -= 3; // j = j - 3
		d /= 2.7;// d = d / 2.7d
		l *= 3;// l = l * 3
		k %= 2;// k = k % 2

		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println("d: " + d);
		System.out.println("l: " + l);
		System.out.println("k: " + k);

		i = k = j; // atibuição composta

		System.out.println("k:" + k);
		System.out.println("i: " + i);

	}

	private static void precedencia() {

		int i = 10;
		int j = 20;
		int k = 30;

		int a = i++ + --j * k; // 10 + 19 * 30 -> 10 + 570 -> 580

		// só quando chegar a 580 vai mudar o valor do i, ele irá fazer a conta toda e
		// depois ajustará o valor do i

		System.out.println("i++ + --j + k: " + a);

		System.out.println("i: " + i); // 11

		int b = k / --i % 3 + 1; // 30 / 10 %3 +1 -> 1

		// o i estava 11 e volta para o 10, a precedencia maior vai ser da divisão e
		// depois o resto

		System.out.println("k / --i % 3 + 1: " + b);

		System.out.println("i: " + i);// 10

		int c = 2; // expressão composta e por outras atribuições

		c *= i += 5; // c=2 * i; i= i + 5 -> c = 2 * i; i = 10 + 5; -> c = 2 * 15; -> c= 2 *15; c =
						// 30

		// primeiro chega ao valor de i recebendo i +5, depois que recebeu o valor ele
		// continua a conta chegando a i 15 *2 dando valor 30.

		System.out.println("c *= i += 5: " + c);
	}

}
