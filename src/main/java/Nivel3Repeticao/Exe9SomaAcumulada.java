package Nivel3Repeticao;

import java.util.Scanner;

public class Exe9SomaAcumulada {

	public static void main(String[] args) {
		
		int num;
		int soma = 0;
		
		try(Scanner input = new Scanner(System.in)){
			
			do {                                                       //Fazer  
				System.out.print("Digite um número (0 para sair): ");
				num = input.nextInt();
				soma += num;
			}while(num != 0);                                          //Enquanto num diferente de zero
			
		}
		
		System.out.printf("Soma: %d",soma);
		
	}

}

//Neste programa equanto não digita Zero o loop continua somando os numeros digitados.