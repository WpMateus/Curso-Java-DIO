# Estrutura de repetição de repetição

### Estrutura de repetição:

Ela é responsável por executar repetitivamente uma instrução ou um bloco de instruções até uma condição estiver sendo satisfeita.

### Tipos:

- while
- do -  while
- for
- enhanced for

### While:

​	public classe Order{

​	private String[] itens;



​	public void printItens(){

​		int i = 0;

​			while(i < itens.length){

​				System.outprintln(itens[i]);

​				i++;

​			}

​	}

}

// enquanto o i for menor que o tamanho da lista, ele vai printar o item da lista, irá percorrer por todos os itens da lista até imprimir todos.



### do - while

​	public classe Order{

​	private String[] itens;



​	public void printItens(){

​		int i = 0;

​			do {

System.out.println(itens[i]);

i++;

} while (i < itens.length);		

​	}

}

// do - faça / while - enquanto uma condição for satisfeita.

do - faça / mostra os itens printando até while o tamanho da lista. Irá printar cada item da lista.



### for:

​	public classe Order{

​	private String[] itens;



​	public void printItens(){

​		for (int = 0; i < itens.length; i++){

System.out.println(itens[1]);

}

​	}

}

// Definido a condição, se i for menor que valor total da lista será printado cada item da lista.



### enhenced for:

​	public classe Order{

​	private String[] itens;



​	public void printItens(){

​		for (String i : itens){

System.out.println(i);

}

​	}

}

// mesma estrutura for, é atribuído os itens da lista para uma variável, é entendido que cada item deve ser atribuído ao i, até acabar a lista toda. Em seguida é printado os itens.
