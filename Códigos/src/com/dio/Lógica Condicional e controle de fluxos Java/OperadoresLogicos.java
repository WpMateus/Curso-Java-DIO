package br.com.dio;
/* Exercicio
 Codificar os exemplos dos slides anteriories para compreender as opera��es l�gicas. Utilize operandos e express�es
 */


public class OperadoresLogicos {

	public static void main(String[] args) {
		
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;
		
		System.out.println("b1 && b2 " + (b1 && b2)); // And � dois e comercial
		System.out.println("b1 && b3 " + (b1 && b3)); // and s� � true quando ambos serem true
		
		System.out.println("b2 || b3 " + (b2 || b3)); // or e s�o as duas barras
		System.out.println("b2 || b4 " + (b2 || b4)); // so quando os dois forem false
		
		System.out.println("b1 ^ b3 " + (b1 ^ b3)); // xor � o acento circunfflexo
		System.out.println("b4 ^ b1 " + (b4 ^ b1)); // quando s�o diferentes da true
		
		System.out.println(!b1); // nega��o com sinal de exclama��o 
		System.out.println(!b2); // o que � true vira false e o que � falso vira true
		
		
		int i1 = 10;
		int i2 = 5;
		float f1 = 20f;
		float f2 = 50f;
		
		System.out.println("((i1 + i2) < (f2 - f1)) && true " + (((i1 + i2) < (f2 - f1)) && true)); // resultados booleanos pode ser apresentado n�o s� com a vari�vel booleana
		System.out.println("(i1 > i2) || (f2 < f1) " + ((i1 > i2) || (f2 < f1))); // mostramos que podemos operadores aritm�ticos, l�gicos e relacionais. Essas express�es resultar� em resultado booleano.
		
		// criando vari�veis intermediarias
		
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
