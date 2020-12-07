package decisao;

import javax.swing.JOptionPane;

public class Teste {

	//&& = and = e
	// || = or = ou
	//!= = not = não é igual
	
	public static void main(String[] args) {
		String tipoacesso = JOptionPane.showInputDialog("Informe seu tipo de acesso").toUpperCase();
		String sexo = JOptionPane.showInputDialog("Informe se seu sexo é masculino ou feminino");
			if (tipoacesso.equals("ADM") && sexo.equals("feminino")) {
				System.out.println("Olá administradora");
			}else {
				System.out.println("Olá administrador");
						
			}if (tipoacesso.equals("USR") && sexo.equals("feminino")) {
				System.out.println("Olá usuária");
			}else {
				System.out.println("Olá usuário");
			}if (tipoacesso.equals("GUEST") && (sexo.equals("feminino") || sexo.equals("masculino"))) {
				System.out.println("Olá visitante");
			}else {
				System.out.println("Olá desconhecido(a)");
			}
	
	
	
	
	
	
	}

}
