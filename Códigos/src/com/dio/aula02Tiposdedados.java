package com.dio;

public class aula02Tiposdedados {

	public static void main(String[] args) {
// todos são inteiros, só muda a capácidade de armazenamento.
		byte b1 = 10;
		byte b2 = 20;
		
		short s1 = 20000;
	//	short s2 = 40000; passou do valor dele e deu erro
		
		// nt i1 = -1000000000000000; passou o limite do int
		int i2 = 288888;
		
		long l1 = 1000000000000000000L; // Deve se usar a letra L ao final 
		long l2 = 2020202020202020202L;
		
		// float f1 = 4.5; falta o f no final, por isso da erro e o valor também não cabe dentro da variável float.
		float f2 = 10.68f;
		
		double d1 = 85.68; // pode ficar sem colocar o d o final
		double d2 = 99.06d;
		
		char c1 = 'w'; // char é somente um caracter.
		// char c2 = 'Tw';
		char c3 = '\u0057';
		
		String st1 = "Fulano"; // usando aspas duplas
		String st2 = "Cicrano";
		String st3 = "asajshdj jhiol asjdha 123455677 &¨%$#@*";
		
		String dt1 = "05/08/2002";
		
		boolean bo1 = true;
		boolean bo2 = false;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(s1);
		System.out.println(i2);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(f2);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(c1);
		System.out.println(c3);
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(dt1);
		System.out.println(bo1);
		System.out.println(bo2);
		
		
	}

}
