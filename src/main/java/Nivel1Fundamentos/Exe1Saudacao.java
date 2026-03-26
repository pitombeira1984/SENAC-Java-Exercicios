package Nivel1Fundamentos;

import java.util.Scanner;

public class Exe1Saudacao {

	public static void main(String[] args) {
		
		String nome;
		
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.print("Digite seu nome: ");
			
			nome = sc.nextLine();			
		}
		
		System.out.println("Olá, " + nome + " ! Bem-vindo ao Java.");

	}

}
