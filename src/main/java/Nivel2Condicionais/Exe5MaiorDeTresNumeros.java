package Nivel2Condicionais;

import java.util.Scanner;

public class Exe5MaiorDeTresNumeros {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			
			int a, b, c, maior;
			
			System.out.print("Digite Três Numeros: ");
			
			if(sc.hasNextInt()) {
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
				
				maior = a;
				
				if(b > maior) maior = b;
				if(c > maior) maior = c;
				
				System.out.println("Maior número: "+ maior);
			}else {
				System.out.println("Valor invaliado. Entre com um numeto inteiro!");
			}
		}

	}

}
