package Nivel1Fundamentos;

import java.time.Year;
import java.util.Scanner;

public class Exe3Idade_Model2 {

	public static void main(String[] args) {
		
		int anoNascimento, anoAtual, idade;
		
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.print("Digite seu ano de Nascimento: ");
			anoNascimento = sc.nextInt();
			
			anoAtual = Year.now().getValue();
			
			if(anoNascimento > anoAtual) {			//Validando informação.
				System.out.print("Ano de nascimento é maior que ano atual. Entre com o valor correto");
				return;
			}
			
			idade = anoAtual - anoNascimento;
			
		}
		
		System.out.println("Você nasceu em "+ anoNascimento +", estamos no ano de "+anoAtual+", então você tem "+idade+" anos de idade");
		
	}

}
