package decisao;

import javax.swing.JOptionPane;

public class Teste {

	//&& = and = e
	// || = or = ou
	//!= = not = n�o � igual
	
	public static void main(String[] args) {
		String tipoacesso = JOptionPane.showInputDialog("Informe seu tipo de acesso").toUpperCase();
		String sexo = JOptionPane.showInputDialog("Informe se seu sexo � masculino ou feminino");
			if (tipoacesso.equals("ADM") && sexo.equals("feminino")) {
				System.out.println("Ol� administradora");
			}else {
				System.out.println("Ol� administrador");
						
			}if (tipoacesso.equals("USR") && sexo.equals("feminino")) {
				System.out.println("Ol� usu�ria");
			}else {
				System.out.println("Ol� usu�rio");
			}if (tipoacesso.equals("GUEST") && (sexo.equals("feminino") || sexo.equals("masculino"))) {
				System.out.println("Ol� visitante");
			}else {
				System.out.println("Ol� desconhecido(a)");
			}
	
	
	
	
	
	
	}

}
