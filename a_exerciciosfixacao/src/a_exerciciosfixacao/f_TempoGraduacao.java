package a_exerciciosfixacao;

import javax.swing.JOptionPane;

public class f_TempoGraduacao {

	public static void main(String[] args) {

		String tipo = JOptionPane.showInputDialog("Informe sua graduação:  \n <1> para Tecnológico \n <2> para Barachelado");
		
		if(tipo.equalsIgnoreCase("1")) {
			System.out.println("O tempo de graduação é de 2 à 3 anos");
		
		}else if(tipo.equalsIgnoreCase("2")){
			System.out.println("O tempo de graduação é de 4 à 6 anos");
		
		} else {
			System.out.println("Opção inválida, digite a opção 1 ou 2");
		}
			
		
				
		
		
		
	}

}
