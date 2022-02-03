# Retornos profº Thiago Leite

### Métodos

- É uma instrução de interrupção
- Simbologia: return // é mais atrelado ao método

### Funcionamento

O método executa o seu retorno quando:

- Completa todas as instruções internas // Encontra um não, return, ele vai finalizar
- Chega a uma declaração explicita de retorno // se algum ponto do método tiver a linha escrita return, ele vai finalizar o método de forma abrrupta
- Lança uma exceção // Durante a execução um erro acontecer o método vai ser finalizado.

O que acontecer primeiro dessas três situações, vai fazer que o método finalize sua execução, ou seja, completa todas as instrução internas e encontrar um return ele vai finalizar. 

### Considerações

- O tipo de retorno do método é definido na sua criação e pode ser um tipo primitivo ou objeto; // o método pode ter como retorno, inteiro, float, tipos primitivos e objetos.
- O tipo de dado do return deve ser compatível com o do método; // Se na sua instrução o método retorna um inteiro, no seu return deve conter o inteiro, caso tenha outro valor que não seja o inteiro vai dar erro de compilação.
- Se o método for sem retorno (void), pode ou não ter um "return" para encerrar sua execução. // Não é obrigatório ter o return, irá executar todas as linhas e finalizar com sucesso ou não se um erro acontecer.

### Exemplos

public String getMensagem(){

return "Olá";

} // irá retornar o texto



public double getJuros(){

return 2.36;

} // irá retornar o valor, pois foi declarado corretamente como double.



public int getParcelas(){

return 1.36f;

} //  irá acontecer um erro, pois foi declarado inteiro e foi dito no retorno para retornar um float.



public void setIdade(){

return 10;

} // o método é void e está  dizendo que vai retornar 10, está errado, porque se ele é void não pode retornar nenhum valor, poderia ter apenas o return; sem valor



public void executar (){

...

​	return;

...

} // se o método é void ele pode ou não ter um retorn, esse return poderia estar dentro do if, se o if fosse tru esse return seria executado, e se fosse falso, esse return não seria executado e o método continuaria sua execução.