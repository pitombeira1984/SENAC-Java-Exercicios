package Nivel1Fundamentos;

import java.util.Scanner;

public class Exe2Soma {

	public static void main(String[] args) {
		
		int a, b, soma;
		
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.print("Digite o Primeiro Número: ");
			a = sc.nextInt();
			
			System.out.print("Digite o Segundo Número: ");
			b = sc.nextInt();
			
			soma = a + b;			
		}
			
		System.out.println("Soma: "+ soma);
		
	}

}
