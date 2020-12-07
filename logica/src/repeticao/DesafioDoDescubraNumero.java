package repeticao;

import javax.swing.JOptionPane;

public class DesafioDoDescubraNumero {

			//Imagine uma brincadeira entre dois colegas, na qual um pensa um número e o outro deve fazer chutes até acertar 
			//o número imaginado. Como dica, a cada tentativa é dito se o chute foi alto ou foi baixo. 
			//Elabore um código dentro deste contexto que leia o número imaginado e os chutes, ao final mostre quantas tentativas foram 
			//necessárias para descobrir o número.

	
	public static void main(String[] args) {
				
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
		int chute = 0;
		int contador = 0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Tente adivinhar o número"));
			contador++;
			if (numero > chute) {
					System.out.println("O número é maior");
				}else if (numero < chute) {
					System.out.println("O número é menor");
				}
		}while (numero != chute);
			System.out.println("Parabéns!!! \n Você acertou com " + contador + " tentativas");
			
		
	}

}
