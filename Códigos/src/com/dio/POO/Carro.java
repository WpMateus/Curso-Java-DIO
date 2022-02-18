package POO;

// Exercicios - POO prof� Thiago Leite
public class Carro {

	String cor;
	String modelo;
	int capacidadeTanque;

	// set � usado para setar ou colocar um valor no atributo
	// void e n�o retorna nada, apenas guardar valor no atributo
	// get pegue/devolva

	// Dependendo de como � usado o get e set pode ferir o encapsulamento

	// Contrutor com sobrecarga
	// mais simples, constroi o carro vazio

	Carro() {

	}

	// lista com diversos par�metros
	Carro(String cor, String modelo, int capacidadeTanque) {
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeTanque = capacidadeTanque;
	}

	// Cor
	void setCor(String cor) { // colocar o valor no atributo, quero colocar um valor no atributo cor
		this.cor = cor;
	}

	String getCor() { // devolva a cor do carro e n�o pode ser void
		return cor;
	}

	// Modelo
	void setModelo(String modelo) {
		this.modelo = modelo;
	}

	String getModelo() {
		return modelo;
	}

	// Tanque
	void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	int getCapacidadeTanque() {
		return capacidadeTanque;
	}

	// M�todo do total do tanque

	double totalvalorTanque(double valorCombustivel) {
		return capacidadeTanque * valorCombustivel;
	}
}
