package br.com.dio;
/* Exercicio
 Codificar os exemplos dos slides anteriories para compreender as operações lógicas. Utilize operandos e expressões
 */


public class OperadoresLogicos {

	public static void main(String[] args) {
		
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;
		
		System.out.println("b1 && b2 " + (b1 && b2)); // And é dois e comercial
		System.out.println("b1 && b3 " + (b1 && b3)); // and só é true quando ambos serem true
		
		System.out.println("b2 || b3 " + (b2 || b3)); // or e são as duas barras
		System.out.println("b2 || b4 " + (b2 || b4)); // so quando os dois forem false
		
		System.out.println("b1 ^ b3 " + (b1 ^ b3)); // xor é o acento circunfflexo
		System.out.println("b4 ^ b1 " + (b4 ^ b1)); // quando são diferentes da true
		
		System.out.println(!b1); // negação com sinal de exclamação 
		System.out.println(!b2); // o que é true vira false e o que é falso vira true
		
		
		int i1 = 10;
		int i2 = 5;
		float f1 = 20f;
		float f2 = 50f;
		
		System.out.println("((i1 + i2) < (f2 - f1)) && true " + (((i1 + i2) < (f2 - f1)) && true)); // resultados booleanos pode ser apresentado não só com a variável booleana
		System.out.println("(i1 > i2) || (f2 < f1) " + ((i1 > i2) || (f2 < f1))); // mostramos que podemos operadores aritméticos, lógicos e relacionais. Essas expressões resultará em resultado booleano.
		
		// criando variáveis intermediarias
		
		double salarioMensal = 11893.58d;
		double mediaSalario = 10500d;
		
		int quantidadeDependentes = 4;
		int mediaDependentes = 2;
		
		System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));
		
		boolean salarioBaixo = salarioMensal < mediaSalario;
		boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
		
		System.out.println((salarioBaixo) && (muitosDependentes));
		
		 boolean receberAuxilio = (salarioBaixo) && (muitosDependentes);
		 System.out.println("Recebe auxilio " + receberAuxilio);
		
	}

}
