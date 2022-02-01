# Tipos de dados profº Thiago Leite

### Conceituação

São os valores e consequentemente operações que as variáveis podem assumir e sofre, respectivamente.

Tipificação: // vária da linguagem de programação

- Estática(forte) vs Dinâmica(fraco) // forte: quando uma linguagem obriga você a definir o tipo de variável /  fraco: não é obrigado a definir o tipo da variável no momento da criação, durante o momento da execução da aplicação a linguagem vai detectar e a partir daquele momento vai assumir que a variável é daquele tipo.
- Primitivo vs Composto // Primitivos - são os dados mais básicos, atômicos e homogêneos, numéricos e textuais. / composto - está ligado a orientação a objeto, heterogêneo, uma composição dentro de outra composição.

### Tipos:

- Textual //  armazenar textos, caracteres, palavra ou linha inteira.
- Numeral // armazenar números, pode ser inteiros ou reais, quanto mais bits maior vai ser os números armazenados.
- Lógico // Não tem tamanhos, apenas para informar se a variável é verdadeira ou falso.
- Objeto

Exemplos numeral:

- byte: -128 até 127 // inteiro de 32 bit
- short: -32.768 até 32.767
- int: -2.147.483.648 até 2.147.483.647
- long: -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807 / inteiro de 64 bits
- float: +_ 3.40282347E+38F // Reais, fracionados de 32 bits. Para definir o valor em float deve colocar o (f) no final do valor
- double: +_ 1.79769313486231570E+308 // fracionados de 64 bits, o (d) é opcional

Exemplos textual:

- char: caracteres de 16-bit unicode // char c = '\u0084' ; ou char c = 'T' //  para caractere isolado sempre usar aspas simples.
- String: um tipo "especial" // String s = "T"; // quando é String é aspas duplas.

Exemplo lógico

- boolean: true e false -> boolean s = false.



Exemplo objeto:

Próximas aulas



| Data Type         | Default Value |
| :---------------- | :------------ |
| boolean           | false         |
| char              | '\u0000'      |
| byte              | 0             |
| short             | 0             |
| int               | 0             |
| long              | 0L            |
| float             | 0.0f          |
| double            | 0.0d          |
| String(e objetos) | null          |

### Boas práticas

Usar de forma adequada cada tipo de dado para cada informação