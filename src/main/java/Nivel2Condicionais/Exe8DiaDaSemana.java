package Nivel2Condicionais;

import java.util.Scanner;

public class Exe8DiaDaSemana {

	public static void main(String[] args) {

		int dia;
		String semana;
		
		try(Scanner input = new Scanner(System.in)){
			
			System.out.print("Digite um numero de 1 a 7: ");
			if(!input.hasNextInt()) {
				System.out.print("Valor Inválido ! Favor Digite um Número Inteiro");
				return;
			}
			dia = input.nextInt();
			
			semana = "";
			
			switch(dia) {
				case 1: semana = "Domingo"; break;
				case 2: semana = "Segunda-Feira"; break;
				case 3: semana = "Terça-Feira"; break;
				case 4: semana = "Quarta-Feira"; break;
				case 5: semana = "Quinta-Feira"; break;
				case 6: semana = "Sexta-Feira"; break;
				case 7: semana = "Sábado"; break;
				default: System.out.print("Dia inválido");
			
			}
			
		}
		System.out.printf("Dia da semana: %s", semana);
	}

}
