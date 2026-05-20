package Nivel1Fundamentos;

import java.util.Scanner;

public class Exe7Media {

	public static void main(String[] args) {

		Double n1,n2,media;
		
		try(Scanner input = new Scanner(System.in)){
			
			System.out.print("Digite o primeiro valor: ");
			if(!input.hasNextDouble()) {
				System.out.print("Dados Invalidos! Favor digite um Número Inteiro ");
				return;
			}
			n1 = input.nextDouble();
			
			System.out.print("Digite o segundo valor: ");
			if(!input.hasNextDouble()) {
				System.out.print("Dados Invalidos! Favor digite um Número Inteiro ");
				return;
			}
			n2 = input.nextDouble();
			
			media = (n1 + n2)/2;
			
		}
		
		System.out.printf("Média igual: %.2f ",media);

	}

}
