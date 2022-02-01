package com.dio;

public class aula04Casting {

	public static void main(String[] args) {

		//downcast � sempre expl�cito, precisa informar o sistema que voc� quer fazer a troca.
		
		byte b1;
		short s1 = 1000;
		b1 = (byte) s1; // convers�o de short para byte, fazendo o downcast, ocasionar� perda de dados

		long l1;
		int i1 = 10;
		l1 = i1; // upcast pegamos o inteiro e colocamos para long, e n�o houve perda de
					// informa��o.

		int i2;
		long l2 = 1000000000000000000L;
		i2 = (int) l2; // downcast, perda de informa��o, e fora do limite m�ximo que o inteiro suporta

		int i3;
		long l3 = 10000L;
		i3 = (int) l3; // nem sempre o downcast haver� perda de informa��es. Neste caso temos um valor
						// que cabe dentro do inteiro.

		double d1;
		float f1 = 10.5f;
		d1 = f1; // com valores reais, de float foi para double

		float f2;
		float f3;
		double d2 = 10000.58; // n�o haver� perda pois o valor cabe dentro do float.
		f2 = (float) d2;
		double d3 = 10000.58888888888888888888888888888888888888888888888888888888888888888888888888888888888888;
		f3 = (float) d3; // haver� perda de informa��o.

		int i4;
		float f4 = 11.5697f;
		i4 = (int) f4; // exemplo cl�ssico e que gera perda, aconteceu o que � chamado de truncar,
						// simplismente ignorar a parte fracionada e usar a parte inteira. Ocasionando
						// perda da parte fracionada.

		System.out.println("b1: " + b1);
		System.out.println("l1: " + l1);
		System.out.println("i2: " + i2);
		System.out.println("i3: " + i3);
		System.out.println("d1: " + d1);
		System.out.println("f2: " + f2);
		System.out.println("f3: " + f3);
		System.out.println("i4: " + i4);

		b1 = (byte) d3;

		System.out.println("b1: " + b1);

	}

}
