package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
			/*for => pr�prio para quando n�o existe intera��o com o usu�rio final
			 * Sintaxe:
			 * 1� - definir o contador
			 * 2� - qual a condi��o para manter a repeti��o
			 * 3� - qual a forma de contagem
			 * for (int cont=0; cont<500;cont++)
			 * para "contador come�ando de 0; at� atingir 500 linhas; incrementa de um em um
			*/
		
			int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite a tabuada"));
			for (int cont=0; cont<11; cont++ ) {
				System.out.println(tabuada + " x " + cont + " = " + (tabuada*cont));
			}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
