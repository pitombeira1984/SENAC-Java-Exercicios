package Nivel1Fundamentos;

import javax.swing.JOptionPane;

public class Exe6CaixaDeDialogo {

	public static void main(String[] args) {

		String name, message;
		
		name = JOptionPane.showInputDialog("Qual o seu nome ?");
		
		message = String.format("Bem vindo, %s, ao programa Java !", name);
		
		JOptionPane.showMessageDialog(null, message);

	}

}
