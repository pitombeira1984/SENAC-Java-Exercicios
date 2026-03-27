package Nivel1Fundamentos;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
		int valor;
		
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.print("Digite um numero para verificar se é par ou impar: ");
			valor = sc.nextInt();
			
			if(valor % 2 == 0) {
				System.out.println("O numero informado é Par");
			}else {
				System.out.println("O numeto informado é impar");
			}
			
		}

	}

}
