package a_exerciciosfixacao;

import javax.swing.JOptionPane;

public class h_DiasVivido {

	public static void main(String[] args) {

		/*
		 * Escreva um programa que recebe a data de nascimento de uma pessoa e a data de hoje,
		 * e calcule aproximadamente, quantos dias ela viveu. Considere um mês com 30 dias e um ano com 365 dias.
			Calcule aproximadamente, o tempo em meses e em anos.

		 */
		
		int anonasc = Integer.parseInt(JOptionPane.showInputDialog("Informe seu ano de nascimento"));
		int anoatual = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual"));
		
		int idade = (anoatual - anonasc);
		System.out.println("A sua idade é: " + idade + " anos");
		System.out.println("A sua idade em 2050 será: " + ((2050-anoatual) + idade + " anos"));
		
		
	}

}
