package POO;

public class Rodar {

	public static void main(String[] args) {

		Carro carro1 = new Carro(); // Construtor padrão, o mais simples default. Não possui parâmetro

		carro1.setCor("Azul");
		carro1.setModelo("BMW");
		carro1.setCapacidadeTanque(60);

		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getCapacidadeTanque());
		System.out.println(carro1.totalvalorTanque(6.39));

		Carro carro2 = new Carro("Cinza", "Mercedez", 58); // Construtor com parâmetros

		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCor());
		System.out.println(carro2.getCapacidadeTanque());
		System.out.println(carro2.totalvalorTanque(6.46));
	}

}
