# Programação Orientada a Objetos - Profº Thiago Leite

### Porque programar orientado a objetos?

- Paradigma Estruturado, tem uma representação mais simplista 
  * Tem mecanismos e conceitos mais limitados de se programar. Faz com que trabalhamos de uma forma simplista, não representa o mundo real.
  * Foca em operações (funções) e dados.
  * Foca mais no "como fazer" -  como resolveremos o problema
- Paradigma Orientado a Objetos tem uma representação mais realista 
  * Tem mais mecanismos e mais avançados do que linguagens estruturadas 
  * Foca na modelagem de entidades do mundo real e nas interações entre elas
  *  Foca mais no "o que fazer" -  qual é o problema que queremos resolver

### Vantagens da OO

- Melhor coesão // Qualquer tipo de linguagem consegue aplicar, o que é? Como se fosse uma redação, todas as ideias estão trabalhando em conjunto, as responsabilidades bem definidas.
- Melhor acoplamento // Bons acoplamentos são flexíveis, com estruturado eles são bem rígidos, diferente da OO. Mecanismos na orientação objeto que facilitam e possibilitam a flexibilidade.
- Diminuição do Gap semântico //  É uma diferença de representação do mundo real para o mundo computacional. Na OO podemos fazer com que os dois mundos fiquem mais próximos.
- Coletor de lixo // Usando e programando, vai consumindo memória, OO tem mecanismos que vai limpando objetos e coisas a mais que não são utilizadas, liberando, evitando travar o computador. A linguagem C não tem o coletor, podendo causar o travamento do software, tendo que o programador ficar limpando manualmente.



# Fundamentos

### O que é Orientação a Objetos?

A Orientação a Objetos é um paradigma de análise, projeto e programação de sistemas de software baseado na composição e interação entre diversas unidades de software chamadas de objetos.

- Abstração - Processo pelo qual se isolam características de um objeto considerando os que tenham em comum certos grupos de objetos. // Capacidade de pensar nas características essenciais e deixar as acidentas de lado. Dando maior reuso do conceito e entidade.
- Reuso -  Capacidade de criar novas unidades de código a partir de outras já existentes. // Em OO temos vários mecanismos para conseguir o reuso, com muito mais alto nível.
- Encapsulamento -  Capacidade de esconder complexidades e proteger dados. // Esconde comportamentos, proteção de dados, mecanismos que cria uma camada de proteção da informação muito mais fácil em OO do que estruturados.

São os 3 pilares da Orientação Objetos.



Exercício

Uma loja on-line de livros, modele uma entidade livro.

*Entidade livro*

Livro = Autor, número de páginas, título, linguagem, tipo do papel, assunto, ano que foi publicado, sub-título, editora, edição, tipo de capa, isbn, peso.

*Para uma loja on-line*

Tema, edição, ano publicação, assunto, autor, editora, ISBN, quantidade de páginas, título, sub-título.

*Para a Editora*

Quantidade de páginas, tipo de papel, tipo de capa, peso, coloração, gramatura, isbn, dimensões, sub-título, editora.

// Para modelar, pense no presente, e não no futuro, pois você pode adicionar coisa que talvez você nem use. Vai gastar muito tempo para fazer certas coisas que não são necessárias, trabalhe com o presente. Caso precise, faça manutenção evolutiva.