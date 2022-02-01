# Conceituação e criação profº Thiago Leite

### O que é variáveis: Conceituação

É um espaço na memória do computador, onde se pode guardar valores.

Existem 4 tipos:

- Instância: objeto
- Classe: classe
- Loca: dentro de métodos
- Parâmetro: Na assinatura do método.

### Criação

Padrão de definição Java:

<?visibilidade?> <?modificador?> tipo nome <?=valorinicial?>;

Os que estão entre ? podemos criar uma variável sem prover esses, no caso sem. O que influência se precisa é o tipo de variável. (visibilidade, modificador, valor inicial).

V: "public" ,  "protected" e "private"

M: "static" e "final" = final é uma variável constante, o valor nunca vai mudar;

T: tipo de dado "Obrigatório, sempre deve ser definido";

N: nome que é fornecido a variável "Nome fornecido para entender para o que ela serve";

VI: valor inicial (opcional).



### Conversões e regras:

- Não devem começar com números. Ex int 1a - não pode /  int a1 o correto;
- Embora permitido, "$" e "_" devem ser evitados;
- São case-sensitive - criar variável com letra minúscula e depois criar a outra com o mesmo nome só que com letra maiúscula o Java vai entender que são variáveis completamente diferentes uma da outra;
- Sem espaços -  não pode ter espaços dentro do nome de variáveis, pois da erro. 
- Não pode usar as palavras reservadas do Java;

### Boas práticas

- Sempre começar com letras minúsculas;

int quantidadeProduto;

- Nomes expressivos;

int qtdProd - não é um nome expressivo

- Notação camelo; (caminha junto com nomes expressivos, pegar e a primeira letra de cada palavra fica em maiúsculo);

int QuantidadeProduto 

- Quando constante (final) maiúscula e separada por "_";

Padrão: int final NUMERO_TENTATIVAS = 5 