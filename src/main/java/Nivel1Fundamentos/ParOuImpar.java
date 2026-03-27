package Nivel1Fundamentos;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {		
		
		try(Scanner sc = new Scanner(System.in)){
			
			int valor;
			
			System.out.print("Digite um numero para verificar se é par ou impar: ");
			
			if(sc.hasNextInt()) {			//Validando se o valor de entrada é um numero
				valor = sc.nextInt();
			
				if(valor % 2 == 0) {		//Validando se o numero é par ou impar
					System.out.println("O numero informado é Par");
				}else {
					System.out.println("O numeto informado é impar");
				}
				
			}else {
				System.out.println("Valor invaliado. Entre com um numeto inteiro!");
			}			
			
		}

	}

}
