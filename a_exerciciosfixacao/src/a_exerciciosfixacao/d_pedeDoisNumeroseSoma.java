package a_exerciciosfixacao;

import javax.swing.JOptionPane;

public class d_pedeDoisNumeroseSoma {
	
	public static void main(String[] args) {
	
	int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero")); //Pedindo para o usu�rio digitar o primeiro n�mero
	int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero"));  //Pedindo para o usu�rio digitar o segundo n�mero
	
	int soma = (a+b); //Realizando a conta
	
	System.out.println("O resultado da soma �: " + soma); //Imprimindo o resultado
			
	}
}
