package Nivel1Fundamentos;

import java.util.Scanner;

public class Exe5NumeroPrimo {

	public static void main(String[] args) {
		
		int num, i;
		boolean ehPrimo = true;
		
		try(Scanner input = new Scanner(System.in)){
			
			System.out.print("Digite um Numero Inteiro para Verificar se é Primo: ");
			if(input.hasNextInt()) {
				num = input.nextInt();
				
				if(num <= 1) {
					System.out.print("Não é Primo");
					return;
				}
				
				for(i = 2; i < num; i++) {
					
					if(num % i == 0) {
						ehPrimo = false;
						break;
					}
										
				}
				
				if(ehPrimo) {
					System.out.print("É Primo");
				}else {
					System.out.print("Não é Primo");
				}
				
			}else {
				System.out.print("Valor Invalido. Digite um Número Inteiro");
			}
			
		}
		
	}

}
