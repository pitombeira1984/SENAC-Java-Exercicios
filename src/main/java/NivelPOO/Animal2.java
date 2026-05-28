package NivelPOO;

class Animal2 {
	
	void emitirSom() {
		System.out.println("Som genérico...");
	}

}

class Cachorro2 extends Animal2{
	@Override
	void emitirSom() {
		System.out.println("Latido!");
	}
}

class Gato2 extends Animal2{
	@Override
	void emitirSom() {
		System.out.println("Miau!");
	}
}

class Calculadora{
	int soma(int a, int b) {
		return a + b;
	}
	
	double soma(double a, double b) {
		return a + b;
	}
}