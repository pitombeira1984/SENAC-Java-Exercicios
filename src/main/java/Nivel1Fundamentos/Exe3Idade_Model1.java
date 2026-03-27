package Nivel1Fundamentos;

import java.util.Scanner;

public class Exe3Idade_Model1 {

	public static void main(String[] args) {

		int anoNascimento, anoAtual, idade;
		
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.print("Digite seu ano de Nascimento: ");
			anoNascimento = sc.nextInt();
			
			System.out.print("Qual o ano atual: ");
			anoAtual = sc.nextInt();
			
			idade = anoAtual - anoNascimento;
			
		}
		
		System.out.println("Você nasceu em "+ anoNascimento +", estamos no ano de "+anoAtual+", então você tem "+idade+" anos de idade");
		
	}

}
