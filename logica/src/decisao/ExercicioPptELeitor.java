package decisao;

import javax.swing.JOptionPane;

public class ExercicioPptELeitor {

	/*
	 * Crie uma classe TesteEleitores que leia a idade de 3 pessoas e informe a sua classe eleitoral:
	 * não eleitor (abaixo de 16 anos);
	 * eleitor obrigatório (entre 18 e 65 anos);
	 * eleitor facultativo (16 , 17 anos ou maior que 65 anos).
	 */
	
	public static void main(String[] args) {
		short idade = Short.parseShort(JOptionPane.showInputDialog("Informe sua idade"));
		if (idade >=18 && idade <=65) {
			System.out.println("Voto obrigatório");
		}else if (idade==16 || idade==17 || idade >65) {
			System.out.println("Voto facultativo");
		}else {
			System.out.println("Não pode votar ainda");
		}
	
	
	
	
	
	
	
	
	
	}

}
