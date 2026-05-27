package NivelPOO;

public class Carro {
	
	//Atributos
	String marca;
	String modelo;
	
	//Construtor
	public Carro(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	//Método
	public void ligar() {
		System.out.println(marca + "" + modelo + "está ligado !");
	}

	public static void main(String[] args) {
		//Criando Objeto
		Carro carro1 = new Carro("Toyota","Corolla");
		Carro carro2 = new Carro("Fiat","UNO");
		
		//Usando Método
		carro1.ligar();
		carro2.ligar();

	}

}
