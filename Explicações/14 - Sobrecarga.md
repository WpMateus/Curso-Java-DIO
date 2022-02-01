# Sobrecarga de método profº Thiago Leite

Conceituação:

É a capacidade de definir métodos para diferentes contextos, mas preservando seu nome.

O mesmo método vai suportar de forma diferente, sempre vai ter o mesmo nome e se comporta de forma diferente conforme o contexto. Para isso acontecer deve se mudar a lista de parâmetros. Alterar a assinatura do método.

- Alterar a assinatura do método:

Ass = nome + parâmetros 

converterParaInteiro(float f); // esse recebeu um float e o resto que está recebendo outros parâmetros, está sobrecarregando um método

converterParaInteiro(double d);

converterParaInteiro(String s);

converterParaInteiro(float f, RoundType rd); // RoundType para saber se arredondou para cima ou para baixo

converterParaInteiro(double d, RoundType rd);

converterParaInteiro(String s, RoundType rd);

**converterParaInteiro(RoundType rd, String s);**

**converterParaInteiro();** // mudou a lista de parâmetros fazendo a sobre carga do primeiro parâmetro

Obs: Mudou a lista de parâmetro e continuou a assinatura do método, se cria uma sobrecarga.

https://docs.oracle.com/javase/7/docs/api/java/io/PrintStream.html

System.out.println(); é sobrecarregado quando há muitos.

Prova que sobrecarga é útil.

![image-20220201151949023](C:\Users\maico\AppData\Roaming\Typora\typora-user-images\image-20220201151949023.png)

Outro exemplo:

https://docs.oracle.com/javase/7/docs/api/java/lang/String.html

Exemplo de sobre carga de String, é comum trabalhar com sobrecarga.

![image-20220201152217163](C:\Users\maico\AppData\Roaming\Typora\typora-user-images\image-20220201152217163.png)



### Sobrecarga x Sobrescrita.

Usado muito em programação os dois.

Sobrecarga - Mudou a lista de parâmetro e continuou a assinatura do método, se cria uma sobrecarga.

Sobrescrita - Conceito de orientação a objetos. Precisa saber orientação por conta da herança. 



Tanto a sobrecarga quanto a sobrescrita são conceitos que atuam sobre os métodos, mas são modos completamente diferentes de trabalhar. Não confunda, atuam e são aplicados em cima de métodos, mas são diferentes.





