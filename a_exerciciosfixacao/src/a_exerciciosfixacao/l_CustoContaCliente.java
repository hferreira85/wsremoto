package a_exerciciosfixacao;

import javax.swing.JOptionPane;

public class l_CustoContaCliente {

	public static void main(String[] args) {

		int diarias = Integer.parseInt(JOptionPane.showInputDialog("informe a quantidade de di�rias"));
		double valorDiaria = 80;
			if (diarias > 15) {
				System.out.println("O Valor total da sua conta �: " + ((diarias*80)+(diarias*5.50)));
			}else if (diarias < 15) {
				System.out.println("O Valor total da sua conta �: " + ((diarias*80)+(diarias*8)));;
			}else {
				System.out.println("O Valor total da sua conta �: " + ((diarias*80)+(diarias*6)));;
			}
				
		
	}

}
