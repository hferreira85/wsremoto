package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {

	public static void main(String[] args) {

		char resposta = 0;
		do {
			String cargo = JOptionPane.showInputDialog("Cargo");
			float salario = Float.parseFloat(JOptionPane.showInputDialog("Sal�rio"));
			resposta = JOptionPane.showInputDialog("Digite <1> para continuar").charAt(0);
		}while(resposta==1);
		
		
		
		
		
		
		
		
		
		
		
	}

}
