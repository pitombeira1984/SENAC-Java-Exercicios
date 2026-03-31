package Nivel2Condicionais;

import java.util.Scanner;

public class Exe5MaiorDeTresNumeros {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			
			int a, b, c, maior;
			
			System.out.println("Verifique entre os numeros digitado o maior");
			
			System.out.print("Digite o Primeiro Número: ");
			if(!sc.hasNextInt()) {
				System.out.println("Valor invalido para o primeiro numero");
				return;
			}
			a = sc.nextInt();
			
			System.out.print("Digite o Segundo Numero: ");
			if(!sc.hasNextInt()) {
				System.out.println("Valor invalido para o segundo numero");
				return;
			}
			b = sc.nextInt();
			
			System.out.print("Digite o Terceiro Número: ");
			if(!sc.hasNextInt()) {
				System.out.println("Valor invalido para o terceiro numero");
				return;
			}
			c = sc.nextInt();
			
			maior = a;
			
			if(b > maior) maior = b;
			if(c > maior) maior = c;
			
			System.out.println("Maior número: " + maior);
			
		}

	}

}
