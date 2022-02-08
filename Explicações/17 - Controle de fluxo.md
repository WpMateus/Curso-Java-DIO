# Controle de fluxo profº Thiago Leite

São estruturas que tem a capacidade de direcionar o fluxo de execução do código.
// se nenhuma dessas estruturas fossem usadas, o código iria ser executado de forma linear, de cima para baixo, da esquerda para direita.
Dependendo da estrutura que for utilizada o código pode se comportar de forma diferente, pode executar um pedaço de código e outro não ou pode executar mais de uma vez, e abortar a inicialização do código.

Tipos:
- Decisão: if, if-else, if-else-if, switch e operador ternário 
- Repetição: for, while, do while
- Interrupção: break, continue e return.

Nessa aula será usada apenas a estrutura de controle de fluxo do tipo de Decisão.
- Decisão: estrutura que avalia uma condição booleana ou variável para direcionar o fluxo de execução.
- Opções: if(se), swithc(escolha), e operador ternário.


Decisão: if(se), if-else, if-else-if, if-else-if-else

Código -> Se -> true -> fim
Código -> Se -> false -> fim

if(condição){
}

if(condição){
}else{
}

// a última é decisão default
if(condição){
} else if(condição){
}else{
}

Exemplos:
if(idade > 18){
}

if(aprovado){
} else{
}

if(casado && temFilhos){
} else if(casado && semFilhos){
} else{
}

### Decisão: operador ternário

![image-20220207121442700](C:\Users\maico\AppData\Roaming\Typora\typora-user-images\image-20220207121442700.png)

Condição booleana que se for true irá executar o exp 1 e se for false roda o exp 2 e termina com ponto e virgula.

Exemplos:

condição? true: false;

condição ? true: null; // opção de não ter o else, o falso. Não executa nada no false.

ligado ? desligar : ligar; // tá ligado, desliga, se não está ligada, liga.

emMovimento ? freia: null; // se está em movimento freia, se já está parado, não precisa fazer nada

obs: operador ternário deve ser evitado ao máximo, pois dificulta a manutenção do código, por escrever em linha.



### Decisão: switch (escolha)

![image-20220207122611163](C:\Users\maico\AppData\Roaming\Typora\typora-user-images\image-20220207122611163.png)

Não usa expressão booleana, ele vai avaliar uma variável, e os valores que essa variável vai ter.

Em Java:

// tipos de variáveis para switch

Variável:

byte

short

char

// mais usados

**int** // inteiros

**Enum** // abreviação de Enumeração, um grupo de constantes

**String** // texto



switch(variável){

​	case 1:

​		break;

​	case...:

​		break;

​	default

​		break;

}



Outro exemplo:

switch(olhos){

case "AZUIS": // se for azul, faça uma coisa, e interrompa

break;

case "VERDES": // se for verde, faça uma coisa e interrompa

break;

Case "CASTANHOS": // se for castanhos, faça uma coisa e interrompa

break;

default: // se não for nenhuma, executa a default

break;

}



### Boas práticas

- Switch é para valores exatos e if para expressões booleanas // se só tem uma variável envolvida na decisão, ao invés de fazer vários if use o switch. E use if's se você tem mais de uma variável envolvida, onde vão trabalhar em conjunto para gerar um valor booleano.

  Switch para valores exatos no caso uma variável e if's para quando tem mais de uma variável envolvida na decisão.

- Evitar usar o default do switch para "cases genéricos" // é usado quando há um valor inválido. Use quando for indicar que o valor passado está errado.

- Evitar o efeito "flecha" dos if's 

- Evitar muitos if's aninhados // Sem muito if's, pois dificulta a leitura do código

- Usar a boa prática para diminuir o tamanho do if
