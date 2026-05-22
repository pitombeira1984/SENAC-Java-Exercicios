package Nivel3Repeticao;

import java.util.Scanner;

public class Exe10Tabuada {

	public static void main(String[] args) {
		
		int tab;
		int i;
		
		try(Scanner input = new Scanner(System.in)){
			
			System.out.print("Digite a Tabuada: ");
			tab = input.nextInt();
			
			for(i = 0; i <= 10; i++) {
				System.out.println(tab + "x" + i + "=" + (tab*i));
			}
			
		}
		
	}

}
