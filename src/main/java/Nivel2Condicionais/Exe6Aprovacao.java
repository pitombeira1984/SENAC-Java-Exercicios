package Nivel2Condicionais;

import java.util.Scanner;

public class Exe6Aprovacao {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			
			double nota;
			
			System.out.print("Digite a nota: ");
			if(!sc.hasNextDouble()) {
				System.out.print("Valor invalido");
				return;
			}
			nota = sc.nextDouble();
			
			if(nota >= 7) {
				System.out.print("Aprovado");
			}else if(nota >= 5) {
				System.out.print("Recuperação");
			}else {
				System.out.print("Reprovado");
			}
			
		}

	}

}
