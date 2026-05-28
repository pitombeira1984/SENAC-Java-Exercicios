package NivelPOO;

public class PolimorfismoDemo {

	public static void main(String[] args) {
		// Polimorfismo por sobrescrito
		Animal2 a1 = new Cachorro2();
		Animal2 a2 = new Gato2();
		
		a1.emitirSom();
		a2.emitirSom();
		
		// Polimorfismo por sobrecarga
		Calculadora calc = new Calculadora();
		System.out.println("Soma int: " + calc.soma(5,  3));
		System.out.println("Soma double: " + calc.soma(2.5, 4.7));
	}

}
