package repeticao;

import javax.swing.JOptionPane;

public class DesafioDoDescubraNumero {

			//Imagine uma brincadeira entre dois colegas, na qual um pensa um n�mero e o outro deve fazer chutes at� acertar 
			//o n�mero imaginado. Como dica, a cada tentativa � dito se o chute foi alto ou foi baixo. 
			//Elabore um c�digo dentro deste contexto que leia o n�mero imaginado e os chutes, ao final mostre quantas tentativas foram 
			//necess�rias para descobrir o n�mero.

	
	public static void main(String[] args) {
				
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero"));
		int chute = 0;
		int contador = 0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Tente adivinhar o n�mero"));
			contador++;
			if (numero > chute) {
					System.out.println("O n�mero � maior");
				}else if (numero < chute) {
					System.out.println("O n�mero � menor");
				}
		}while (numero != chute);
			System.out.println("Parab�ns!!! \n Voc� acertou com " + contador + " tentativas");
			
		
	}

}
