package Nivel2Condicionais;

import java.util.Scanner;

public class Exe7Calculadora {

	public static void main(String[] args) {

		double a, b, resultado;
		char op;
		
		try(Scanner input = new Scanner(System.in)){
			
			System.out.print("Digite o Primeiro Valor: ");
			if(!input.hasNextDouble()) {
				System.out.print("Valor Inválido ! Digite um Inteiro ou um Flout");
				return;
			}
			a = input.nextDouble();
			
			System.out.print("Digite o Segundo Valor: ");
			if(!input.hasNextDouble()) {
				System.out.print("Valor Inválido ! Digite um Inteiro ou um Flout");
				return;
			}
			b = input.nextDouble();
			
			System.out.print("Escolha Entre as Operações: (+, - , * , /): ");
			op = input.next().charAt(0); //Está lendo o primeiro caractere de uma String para salvar na variável op
			
			resultado = 0;
			
				switch(op) {
				case '+': resultado = a + b; break;
				case '-': resultado = a - b; break;
				case '*': resultado = a * b; break;
				case '/': resultado = a / b; break;
				default: System.out.print("Operação Inválida");
			}
			
		}
		
		System.out.printf("Resultado: %.2f", resultado);

	}

}
