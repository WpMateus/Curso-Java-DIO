# Entendendo método profº Thiago Leite

Conceituação: O que é?

É uma porção de código (sub-rotina) que é disponibilizada por uma classe. Este é executado quando é feita uma requisição a ele. São responsáveis por definir e realizar um determinado comportamento.

Todo método deve ser criado dentro de uma classe, ele é executado pela aquisição, deve-se chamar o método, responsável por fazer os softwares funcionar.

### Criação

Padrão de definição:



<?visibilidade? > <?tipo? > <?modificador? > retorno, nome (<?parâmetros? >) <?exceções? > corpo



Entre interrogações (?) é opcional. O retorno, nome e corpo é necessário.



+V: "public", "protected" ou "private" // orientação a objetos



T: Concreto ou abstrato // orientação a objetos



M: "static" ou "final" // orientação a objetos



+R: Tipo de dado ou "void" // é qualquer um dos tipos de dados primitivos básicos, objeto ou uma classe. Ou o vazio, significa que não vai retornar nada.



+N: Nome que é fornecido ao método // existe padrão e é o mesmo de variáveis



+P: Parâmetros que pode receber // Se não utilizar parâmetros o método deve ser fechado entre parênteses.



E: Exceções que pode lançar // erros que ele pode disparar



+C: Código que possui ou vazio // vazio atrelado a orientação a objeto.



Obs: itens com + na frente são os mais utilizados.



Exemplos básicos de métodos;



public String getNome(){...} // método que vai retornar um texto, o corpo está englobada entre chaves



public double calcularTotalNota(){...} // dado primitivo



public int verificarDistancia(int cordenada1, int cordenada2){...} // passando um ou mais parâmetros para o método, com tipos primitivos.



public abstract void executar(); // corpo vazio do método



public void alterarFabricante(Fabricante fabricante){...} // tipo complexo, entidade e objetos fabricante.



public Relatorio gerarDadosAnaliticos(Cliente cliente, list < compra > compras){...} // como passar mais de um parâmetros;



**public static R N(P){...} // mais usado no curso, R: retorno, N: nome e P: parâmetros, e o corpo**

### Utilização



Passa-se uma mensagem através de uma classe ou objeto.



nome_da_classe.nome_do_metodo(); ou nome_da_classe.nome_do_metodo(...); // deve se chamar a partir de uma classe ou objeto. Com parâmetros e sem parâmetros, obs: chamando via classe.



nome_do_objeto.nome_do_metodo(); ou nome_do_objeto.nome_do_metodo(...); // chamando via objeto, forma genérica dos dois



Math.random(); ou Math.sqrt(4); // classse que o java disponibiliza, com parâmetros e sem parâmetros em classe. Classe sempre com a primeira letra maiúscula. 



usuario.getEmail(); ou usuario.alterarEndereco(endereco); // chamar a partid de um objeto, get pegar o email e devolver o email do usuário. Obejto nos métodos começam com letras minúsculas. 



### Particularidades

- Assinatura: é a forma de identificar unicamente o método

Ass = nome + parâmetros // isso que define a assinatura do método.

​	

Métodos:



public double calcularTotalVenda(double precoItem1, double precoItem2, double precoItem3){...}

// sua assinatura do método seria depois de public double

​	Assinatura:



calcularTotalVenda(double precoItem1, double precoItem2, double precoItem3)

// caso não tenha valores o parâmetros a assinatura seria apenas o método e parâmetros vazia. Pode ser uma assinatura vazia.



- Construtor e Destrutor: são métodos especiais usados na Orientação a Objetos. // Será visto nos próximos cursos. O construro cria objetos e o destrutor auxilia na destruiçaõ desses objetos

- Mensagem: é o ato de solicitar ao método que o mesmo execute. Esta pode ser direcionada a um objeto ou a um classe. // 

- passagem de parâmetros: // quando a lista não está vazia

   
   
  - Por valor (cópia) // explorar apenas essa nesse curso
  - Por referência (endereço) //  muito haver com orientação a objeto

  

  Por valor (cópia)

  int i = 10

  public void fazerAlgo(int i){

  i = i +10;

  System.out.println("Valor de i dentro: " + i); // dentro do método, irá mostrar 20. Aqui foi feito o valor por cópia, foi mexido com a cópia do valor, tudo que for feito aqui dentro não será mostrado fora
  
  }
  
  System.out.println("Valor de i fora: " + i); // fora do método, irá mostrar 10;



Por referência irá fazer ao contrario do valor, será mostrado nas próximas aulas.



### Boas práticas



- Nomes devem ser descritivos, mas curtos // usar muitos verbos e substantivos
- Notação camelo // a primeira palavra minúscula e a outra primeira letra maiúscula. 

verificarSaldo(); executarTrnsferencia(...); existeDebito();

- Deve possuir entre 80 e 120 linhas // muitas linhas ficam difíceis de entender e de manter ele, ideal é dentro desses valores
- Evite lista de parâmetros longas // os mais curtos possíveis, quanto menos melhor, tem muito haver com orientação objetos
- Visibilidade adequadas // sejam definidos com a visibilidade adequadas, fáceis de entender e de mante.





Links de onde foi tirado as aulas de métodos:

https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html

https://www.casadocodigo.com.br/products/livro-oo-conceitos