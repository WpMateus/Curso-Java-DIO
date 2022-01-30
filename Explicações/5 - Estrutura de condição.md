# Estrutura de condição

### Estrutura de condição:

Ela é responsável por fazer o desvio do fluxo de execução do código de acordo com uma condição dada.

### Tipos:

- if-else

- switch-case

  if-else:

  Conhecido como Se e Se não:

  ​	Public class Order{

  ​		private final double totalValue;

  

  ​		public double calculateFeet(){

  ​			if(this.totalValue > 100){

  ​				return this.totalValue = 0.99;

  } else{

  ​	return this.totalValue;

  ​		}

  ​	}

  // Se o totalValue for maior que 100 é retornado o valor total e uma taxa de 0.99, se não retorna apenas o valor total.



switch-case:

Public class Order{

​		private final double totalValue;



​		public double calculateFeet(){

switch(totalValue){

​	case 100;

​			return totalValue = 0.99;

​	case 200;

​			return totalValue = 1.99;

​	default:

​			return totalValue;

​			}

​	}

}

// palavra reservada swithc e coloca o que quer testar / Case =  caso ;

Caso o valor total for 100 retorna o valor total vezes a taxa de 0.99 . Caso o valor for 200 retorna o valor total vezes 1.99 e caso não caia em nenhuma dessas condições (default) retorna apenas o valor total.
