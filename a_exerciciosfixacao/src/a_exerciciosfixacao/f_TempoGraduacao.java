package a_exerciciosfixacao;

import javax.swing.JOptionPane;

public class f_TempoGraduacao {

	public static void main(String[] args) {

		String tipo = JOptionPane.showInputDialog("Informe sua gradua��o:  \n <1> para Tecnol�gico \n <2> para Barachelado");
		
		if(tipo.equalsIgnoreCase("1")) {
			System.out.println("O tempo de gradua��o � de 2 � 3 anos");
		
		}else if(tipo.equalsIgnoreCase("2")){
			System.out.println("O tempo de gradua��o � de 4 � 6 anos");
		
		} else {
			System.out.println("Op��o inv�lida, digite a op��o 1 ou 2");
		}
			
		
				
		
		
		
	}

}
