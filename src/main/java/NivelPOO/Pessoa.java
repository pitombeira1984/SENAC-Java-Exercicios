package NivelPOO;

public class Pessoa {
	//Atributos
	String nome;
	String idade;
	
	//Construtor
	public Pessoa(String nome, String idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	//Método
	public void apresentar() {
		System.out.println("Olá, sou " + nome + " e tenho " + idade + " anos.");
	}

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Tiago","42");
		p.apresentar();

	}

}
