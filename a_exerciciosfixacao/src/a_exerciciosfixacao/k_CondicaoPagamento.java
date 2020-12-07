package a_exerciciosfixacao;

import javax.swing.JOptionPane;

public class k_CondicaoPagamento {

	public static void main(String[] args) {
		double precoNormal = Double.parseDouble(JOptionPane.showInputDialog("Informe o preco de etiqueta do produto"));
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a forma de pagamento \n <1> À vista (dinheiro ou cheque) \n "
				+ "<2> À vista no cartão de crédito \n <3> Em 2 vezes \n <4> Em 3x vezes"));
		double opcao1 = (precoNormal - (precoNormal * 0.10)); 
		double opcao2 = (precoNormal - (precoNormal * 0.05));
		double opcao3 = precoNormal;
		double opcao4 = (precoNormal - (precoNormal * 0.10)); 
		if (opcao == 1) {
			System.out.println("O Valor total é R$" + opcao1);
		}else if (opcao ==2) {
			System.out.println("O Valor total é R$" + opcao2 );
		}else if (opcao==3) {
			System.out.println("O Valor total é R$" + opcao3);
		}else {
			System.out.println("O valor total é R$" + opcao4);
		}

	}

}
