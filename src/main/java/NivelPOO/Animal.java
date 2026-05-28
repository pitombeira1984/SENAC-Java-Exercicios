package NivelPOO;

public class Animal {
	
	String nome;
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public void emitirSom() {
		System.out.println("Som genérico...");
	}

}

class Cachorro extends Animal{
	public Cachorro(String nome) {
		super(nome);//chama construtor da superclass
	}
	
	@Override
	public void emitirSom() {
		System.out.println(nome + " está latindo !");
	}
}

class Gato extends Animal{
	public Gato(String nome) {
		super(nome);
	}
	
	@Override
	public void emitirSom() {
		System.out.println(nome + " está miando !");
	}
}




