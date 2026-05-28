package NivelPOO;

public class CarroV2 {
	
	private String marca;
	private String modelo;
	
	//getter - Acessar Valor
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	//setter - Modificar Valor
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public static void main(String[] args) {
		
		CarroV2 c = new CarroV2();
		c.setMarca("Toyota");
		c.setModelo("Corolla");
		
		System.out.printf("Meu carro é um %s %s", c.getMarca(), c.getModelo());

	}

}
