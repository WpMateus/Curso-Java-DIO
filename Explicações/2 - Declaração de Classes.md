# Declarando Classes em Java

### Estrutura básica de uma classe:

Public é modificador de acesso e class é a palavra reservada.

- public class (nome da classe "Sempre em maiusculo representando objeto da vida real") {

  // Atributos e métodos

  }

### Estrutura com atributos e métodos:

Private é modificador de acesso / final palavra reservada e em seguida o tipo do atrivuto ou da variavel.

- public class (nome da classe){

  // Atributos

  private final String code;

  private final BigDecimal totalValue;

  

  // metodos / modificador de acesso public o tipo de retorno que seria Big e o nome do método represntavel.

  public BigDecimal calculateFee(){

  

  }

  }

### Estrutura completa de uma classe:

Package é a definição do pacote da qual a classe se encontra

Import precisa usar outra classe de outro pacote.

- Package com.dio.base;

  import java.math.BigDecimal;



public class Order{

​	private final String code;

​	private final BigDecimal totalValue;



public Order(String code, BigDecimal totalValue){

​	this.code = code;

​	this.totalValue = totalValue;

}

public BigDecimal calculateFree(){

​	return this.totalValue.multiply(new BigDecimal("0.99"));

}

}
