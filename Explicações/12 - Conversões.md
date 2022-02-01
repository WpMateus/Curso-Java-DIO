# Conversões profº Thiago Leite

É mais conhecido com o termo Casting.

Conceituação:

É a transformação de uma determinada variável de tipo menos específico para um tipo mais específico ou vice-versa.



### Tipos:

- Upcast (implícito) : Promoção de um tipo de dado, de menor capacidade para um tipo maior, sendo implícito.

- downcast (explícito) : pegar uma variável de capacidade maior e rebaixar ela para menor capacidade de armazenamento. É necessário informar sobre, para a linguagem conseguir entender e até se preocupar com possíveis perdas de dados. 

  Poder ser feito em primitivos ou compostos (objetos).

  

A utilização do Upcast e Downcast

![image-20220131212959165](C:\Users\maico\AppData\Roaming\Typora\typora-user-images\image-20220131212959165.png)

Exemplos:

- long l; int i = 10; l = l;
- int i; long l = 100; i = (int) l;
- double d; float f = 10.5f; d = f;
- float f; double d = 10.5d; f = (float) d;
- int i; float f = 10.5f; i = (int) f; // deve tomar cuidado com esse, pois descarta os *centavos.