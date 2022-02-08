# Operadores lógicos e relacionais profº Thiago Leite

# Operadores relacionais

### O que são operadores relacionais:

São símbolos especiais quais são capazes de realizar comparações entre determinados operandos e, em seguida, retornar um resultado.



Tipos:

- Similaridade: igual, diferente // == , !=
- Tamanho: maior, maior igual, menor, menor igual. // > , >=, <, <=

Esses dois tipos, ao contrario dos operadores aritméticos, sempre existiram pelo menos dois operandos, mesmo que sejam iguais. Em aritméticos apenas um, e operando são dois.



# Utilização

Similaridade

- Igualdade: determina se um operando é igual ao outro
- Diferença: determina se um operando não é igual ao outro



Simbologia

- Igualdade: == //sempre dois iguais, se tiver apenas um é uma atribuição
- Diferença: !=



Tamanho

- Maior: determina se um operando é maior do que outro
- Maior igual: determina se um operando é maior ou igual a outro



Simbologia

- Maior: >
- Maior igual: >=



Tamanho

- Menor: determina se um operando é menor do que outro
- Manor igual: determina se um operando é menor ou igual a outro



Simbologia

- Menor: <
- Manor igual: <=



Exemplos:

int i1 = 10; int i2 = 20; float f1 = 4.5f; float f2 = 3.5f; char c1 = 'x'; char c2 = 'y'; String s1 = "Fulano"; String s2 = "Fulano"; boolean b1 = true; boolean b2 = false;



i1 == i2, i1 != i2, i2 > i2, i1 <= i2

f1 == f2, f1 != f2, f1 >= f2, f1 < f2

c1 == c2, c1 != c2, c1 > c2, c1 <= c2

s1 == s2, s1 != <u>s2, s1 >= f2, s1 < s2</u>

b1 == b2, b1 != <u>b2, b1 > b2, b1 <= i2</u>

i2 > f1 // aqui da certo, mas ambos são numéricos.



// **Sublinhado** nem todo operador relacional de similaridade ou de tamanho pode ser aplicado a qualquer tipo de dado ou entre qualquer tipo de dado.



# Operadores Lógicos

### O que são:

São símbolos especiais quais são capazes de realizar comparações lógicas entre operandos lógicos ou expressões e, em seguida, retornar um resultado.

// Excluindo números, apenas se esteja dentro de expressões.



Tipos:

- Conjunção
- Disjunção
- Disjunção exclusiva
- Negação



Conjunção: operação lógica que só é verdadeira quando ambos os operandos ou expressões envolvidas são verdade.

![image-20220204075635754](C:\Users\maico\AppData\Roaming\Typora\typora-user-images\image-20220204075635754.png)



Disjunção: operação que só é falsa quando ambos os operandos ou expressões envolvidas são falsos.

![image-20220204075825285](C:\Users\maico\AppData\Roaming\Typora\typora-user-images\image-20220204075825285.png)



Disjunção exclusiva: operação que só é verdade quando ambos os operandos ou expressões são opostos.

![image-20220204075946719](C:\Users\maico\AppData\Roaming\Typora\typora-user-images\image-20220204075946719.png)



Negação: operação que inverte o valor lógico de um operando ou expressão.

![image-20220204080106352](C:\Users\maico\AppData\Roaming\Typora\typora-user-images\image-20220204080106352.png)



### Qual utilizar?

Irá depender da necessidade do que está fazendo.

Curiosidade:

- Operadores bitwise: & e | // vai mexer com bits de números inteiros, não são operadores lógicos.
- Operadores shift: ~, >>, >>>, << //  vai ou inverter os bit ou vai mexer com os zeros a esquerda ou a direita. 

Obs: dificilmente é usado

### Exemplos:

boolean b1 = true; boolean b2 = false; boolean b3 = true; boolean b4 = false;

b1 && b2, b1 && b3 // b1 and b2 será falso e b1 e b3 será verdade

b2 || b3, b2 || b4 // b2 ou b3 será verdade e b2 ou b4 será falso

b1 ^ b3, b4 ^ b1 // b1 xor b3 são iguais e será falso e b4 xor b1 será verdade

!b1, !b2 // b1 irá virar false e b2 irá virar true

(i1 > i2) || (f2 < f1) // a depender dos valores, o ou irá mostrar qual será, true ou false

((i1 + i2) < (f2 - f1))  && true // se a soma for menor que a subtração desses e true poderá dar true ou false



## Boas práticas

- Crie variáveis auxiliares para guardar resultados intermediários

(salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)

pode ser

(salarioBaixo) && (muitosDependentes)



boolean recebeAuxilio = (salarioBaixo)

​	&& (muitosDependentes);



// Diminuir as linhas para facilitar a visualização e a manutenção do código.