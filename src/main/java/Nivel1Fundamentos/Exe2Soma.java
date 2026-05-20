package Nivel1Fundamentos;

import java.util.Scanner;

public class Exe2Soma {

	public static void main(String[] args) {
		
		int n1, n2, soma;
		
		try(Scanner input = new Scanner(System.in)){
			
			System.out.print("Digite o Primeiro Valor: ");
			if(!input.hasNextInt()) {
				System.out.print("Dados Inválidos, Favor digite um numero inteiro");
				return;
			}
			n1 = input.nextInt();
			
			System.out.print("Digite o Segundo Valor: ");
			if(!input.hasNextInt()) {
				System.out.print("Dados Inválidos, Favor digite um numero inteiro");
				return;
			}
			n2 = input.nextInt();
			
		}
		
		soma = n1 + n2;
		System.out.printf("A soma de %d e %d é igual a %d", n1,n2,soma);
		
	}

}
