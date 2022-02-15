# Estrutura de Repetição profª Camila Cavalcante

Anotações de entendimento do curso de estrutura de repetição e arrays, pela plataforma DIO.  https://web.dio.me/course/estruturas-de-repeticao-e-arrays-em-java/learning/c8f1bd80-21dc-4aa9-b967-a7da11000851?back=/track/gft-start-4-java

- O real poder dos computadores está na sua habilidade para repetir uma operação ou uma série de operações várias vezes.
- Cada repetição é chamada de laço (loop) é um dos conceitos básicos da programação estruturada.
- Uma estrutura de repetição permite que uma sequência de comandos seja executada repetidamente, caso determinadas condições sejam satisfeitas.

Vai ter a estrutura de repetição, vai ter a sequencia de comandos, se uma condição for true, fica fazendo o loop, executa de novo, até a condição retornar false

- Essas condições são representadas por expressões lógicas. // True ou false.

### Classificadas

- Repetição com teste no início (while)

- Repetição com teste no final (do-while)

- Repetição contada (for)

  * O comando Break é utilizado para terminar de forma abrupta uma repetição. // com estruturas de condição, vemos o break, como o switch. Pode ser utilizado fora da estrutura de repetição.
  * Quando comando Continue é executado, os comandos restantes da repetição são ignorados e programa volta a testar novamente ou não. // Quando é inserido no laço, o que estiver após o continue, não é executado, volta novamente para testar se vai dar true ou false. Só pode ser utilizado dentro de uma estrutura de repetição. Muito pouco utilizado.

  

  ### while

  ![image-20220209195632899](C:\Users\maico\AppData\Roaming\Typora\typora-user-images\image-20220209195632899.png)

  Fluxograma criado pela instrutora do curso, Camila Cavalcante.

  https://github.com/cami-la

  Expressão, se cair no número true (1) vai cair na sentença e rodar o código que está inserido e vai voltar para expressão, caso caia em false (0) o programa finaliza, não entra na sentença. O break ficaria dentro da sentença (se entre algum comando da sentença tenha o break ela não determina e cai para o fim, porque o break interrompe de forma abrupta). Caso tenha continue, voltaria novamente para expressão.

  

  ### do-while

![image-20220209200445129](C:\Users\maico\AppData\Roaming\Typora\typora-user-images\image-20220209200445129.png)

Fluxograma criado pela instrutora do curso, Camila Cavalcante.

https://github.com/cami-la/loops-e-arrays

Deu início, vai executar a sentença independente se for true ou false, e vai para expressão, se for true, volta para sentença e será executada mais uma vez e vai cair de novo na expressão. Caso caia em expressão e for false, encerra o laço.



### For

![image-20220209200755985](C:\Users\maico\AppData\Roaming\Typora\typora-user-images\image-20220209200755985.png)

Fluxograma criado pela instrutora do curso, Camila Cavalcante.

https://github.com/cami-la/loops-e-arrays

For no final será a mesma coisa que while e do-while, porém escrito de forma diferente.

Ele entra e se a condição for satisfeita (1), vai para o número, vai executar a sentença e vai ter uma atualização, é obrigatório ter atualização, volta para o teste, caso dê true, caso dê false (0), o que estiver relacionado ao programa termina.



### Operadores de incremento e decremento

![image-20220209201321440](C:\Users\maico\AppData\Roaming\Typora\typora-user-images\image-20220209201321440.png)

![image-20220209201434664](C:\Users\maico\AppData\Roaming\Typora\typora-user-images\image-20220209201434664.png)

### Operações aritméticas

![image-20220209202015083](C:\Users\maico\AppData\Roaming\Typora\typora-user-images\image-20220209202015083.png)

https://github.com/cami-la/loops-e-arrays



# Arrays

- É um objeto utilizado para armazenar sequencialmente dados do mesmo tipo. // Estrutura primitiva para armazenar dados do mesmo tipo, é como se fosse uma variável, porém armazena apenas o mesmo tipo.
- Permanece com o mesmo tamanho depois que foi criado. // Precisa dizer o tamanho dele, quantos elementos vão ser colocados. Criar um de 10 posições e ocupar 4 posições está ok, não pode criar um de 10 posições e colocar 11, vai dar erro.

### Poder ser divididos em duas categorias

![image-20220209202823515](C:\Users\maico\AppData\Roaming\Typora\typora-user-images\image-20220209202823515.png)

Array simples. Estrutura onde há vários elementos, a posição começa do zero. Nome C e o colchete (Índice) e o número dentro, guarda a posição do elemento indicado na parte verde.



![image-20220209202835021](C:\Users\maico\AppData\Roaming\Typora\typora-user-images\image-20220209202835021.png)

Linha e coluna, o primeiro colchete guarda a posição da linha e o segundo guarda a da coluna. Parece plano cartesiano (onde faz a tabela e guarda os números A(x, y) B(x, y)) e matriz 3x4.