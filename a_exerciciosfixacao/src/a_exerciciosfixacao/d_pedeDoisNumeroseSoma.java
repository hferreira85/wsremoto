package a_exerciciosfixacao;

import javax.swing.JOptionPane;

public class d_pedeDoisNumeroseSoma {
	
	public static void main(String[] args) {
	
	int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número")); //Pedindo para o usuário digitar o primeiro número
	int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));  //Pedindo para o usuário digitar o segundo número
	
	int soma = (a+b); //Realizando a conta
	
	System.out.println("O resultado da soma é: " + soma); //Imprimindo o resultado
			
	}
}
