# Estrutura básica da Orientação Objetos - profº Thiago Leite.

Estruturas básicas:

- Classe
- Atributo
- Método
- Objeto
- Mensagem



### Classe

**É uma estrutura que abstrai um conjunto de objetos com características similares.** Uma classe define o comportamento de seus objetos através de métodos e os estados possíveis destes objetos através de atributos. Em outros termos, uma classe descreve os serviços providos por seus objetos e quais informações eles podem armazenar.

**Finalidade** - Servir de molde, modelar nosso conceito do mundo real, de uma forma que possa criar vários objetos, abstraindo características similares.

**Exemplos**: Entidades concretas e abstratos.

Com classe conseguimos representar ambos.

Bola, carro, viagem, computador, venda, comprador.

**Dicas**: 

- Substantivos // uma bola, um carro, viagem. Concretos ou abstratos.
- Nomes significativos // Ser definidas com nomes significativos.
- Contexto deve ser considerado // o contexto da situação deve ser considerado. 

**Códigos -  como se cria uma classe**

Java

class Carro {

}

Exercício crie a classe "Carro" na IDE.



### Atributo

É o elemento de uma classe responsável por definir sua estrutura de dados. O conjunto destes será responsável por representar suas características e fará parte dos objetos criados a partir da classe.

Primeira coisa que podemos colocar dentro de uma classe é um atributo. Para definir atributos parecidos ao mundo real.

**Exemplo:**

Carro - cor

Viagem - distância

Computador - memória

Venda - valor

Comprador - nome

Bola - diâmetro 

Esses atributos estão tornando o processo de representação mais fino, tentando representar da forma mais próxima do mundo real.



*Atributo x Variável*

A: O que é próprio e peculiar a alguém ou a alguma coisa. // Caracterizar melhor seus conceitos. Dentro das classes criamos atributos. Para caracterizar um objeto do mundo real, o atributo é usado.

V: Sujeito a variação ou mudanças; que pode variar: inconstante, instável. // ciclo de vida muito mais curto, usado dentro da execução dentro de alguma operação.  Dentro dos métodos

São diferentes.

**Dicas**

- Substantivos e adjetivos // Estão ligados a adjetivos, caracterizar o substantivo. Ex: Carro mas a cor é cinza
- Nomes significativos 
- Contexto deve ser considerado // entender o nicho de negócio que está tratando
- Abstração // Não sair definindo todos atributos possíveis, pode estar definindo coisas desnecessárias
- Tipos adequados // Definir o tipo de dado adequado para seu atributo.



**Código -  como definir atributo**

Classe Carro{

int portas;

}



Exercício

Evolua o exercício 1 e defina 3 atributos para sua classe "Carro": cor, modelo e capacidade do tanque.



### Método

É uma porção de código (sub-rotina) que é disponibilizada pela classe. Este é executado quando é feita uma requisição a ele. Um método serve para identificar quais serviços, ações, que a classe oferece. Eles são responsáveis por definir e realizar um determinado comportamento.

Cria métodos quando precisa, não é porque OO existe que é obrigado a usar. Não possui métodos para bola e sim atributos, como diâmetro, cor, tamanho.

**Exemplos:**

Carro - ligar

Bola - fora, não possui nenhuma operação que ofereça

Venda - calcular total

Comprador - realizar troca

Computador - desligar



**Criação**

Java

- Visibilidade
- Retorno // atrelado a tipo de dado.
- Nome
- Parâmetros

**Dicas**

- Verbos //  Para identificar as ações e os comportamento
- Nome significativos
- Contexto deve ser considerado



**Código método**

Java

class Carro {

​	void frear() {

...

   }

}



**Dois métodos especiais**

- Construtor
- Destrutor



Construtor -  constrói objetos, usando o método construtor, conseguimos criar objetos a partir da nossas classes. Para fazer isso devemos definir o construtor. Prover valores iniciais, caso não queira passar os valores, criando vazio, não precisa definir o construtor.

Java

class Carro {

​	Carro(){

​	...

​	}

}



Destrutor -  auxilia na destruição de um objeto, na hora que o coletor de lixo vai apagar o objeto, o próprio chama o destrutor para auxiliar no código. Vai usar se precisa liberar um recurso antes do coletor deletar. Liberar possíveis recursos para não causar travamento, sendo que não está sendo usado.

Java

class Carro {

​	void finalize(){

​	...

​	}

}



- Sobrecarga

  * Mudar a assinatura de acordo com a necessidade

  - Assinatura: nome + parâmetros

Java

m1 ()

m1 (int i)

m1 (float f)

m1 (tring s, long 1)

m1 (long 1, String s)

**Porque usar?**

Vai de acordo com o que irá fazer, como calcular uma compra, calcular desconto, calcular total da compra, calcular o parcelamento. Só muda a lista de parâmetros. Ajuda a facilitar o entendimento do software.

**Exercício**

Evolua o conceito do exercício 2 e defina 1 método para calcular o valor total para encher o tanque. Este deve receber como parâmetro o valor da gasolina. Faça também duas sobrecargas do construtor.



### Boas práticas

Os construtores devem sempre estar abaixo dos atributos, depois os gets e sets e se tiver métodos de negócios, coloca por último. Boa prática de organização.



**O que é o this?**

Tem haver com objeto, quando criamos objetos da classe, é uma forma de diferenciar o que pertence a objeto e o que não pertence a objeto. Caso não coloque o this, informa que você está pegando o parâmetro e colocando nele, ele mesmo, sem lógica. O this tira a ambiguidade.



### Objeto

Um objeto é a representação de um conceito/entidade do mundo real, que pode ser física (bola, carro, árvore etc.) ou conceitual (viagem, estoque, compra etc.) e possui um significado bem definido para um determinado software. Para esse conceito/entidade, deve ser definida inicialmente uma classe a partir da qual posteriormente serão instanciado objetos distintos.

Tudo começa com a classe, a classe é uma coisa estática, um molde, definimos para saber como vamos definir e manipular os objetos. Para que ela funcione devemos criar objetos a partir dela, eles estarão na memória do computador e faz com que funcionem.

**Criação**

Java

Carro carro =  new Carro (); // Construtor, estou pedindo para construir um objeto, uma instância da classe carro e armazenar na variável "carro". Criando um objeto e armazenando.

# Mensagem

É o processo de ativação de um método de um objeto. Isto ocorre, quando uma requisição (chamada) a esse método é realizada, assim disparando a execução do seu comportamento descrito por sua classe. Pode também ser direcionada diretamente à classe, caso a requisição seja a um método estático.

Troca de mensagens entre objetos e classes que fazem o sistema funcionar.



**Criação**

Java

Carro carro = new Carro(); // criação do objeto

carro.<método>; // ponto e chamo o método que quero para o objeto.

Carro.<método>; // se for para classe não precisa usar para o objeto e sim para classe. Coloca o ponto e chama o método.



# Conceitos mais avançados

- Instância x Estático: atributos e métodos
- Estado de um Objeto
- Identidade de um Objeto
- Representação numérica de um objeto
- Representação padrão de um objeto.

**Exercício 4**

Evolua o conceito do exercício 3 criando objetos da classe "Carro". Use os métodos set/get, quando aplicáveis, para definir os valores dos atributos e exibir estes valores "get". Passe também uma mensagem para o cálculo do total para encher o tanque.
