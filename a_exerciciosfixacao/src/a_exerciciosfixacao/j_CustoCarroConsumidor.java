package a_exerciciosfixacao;

import javax.swing.JOptionPane;

public class j_CustoCarroConsumidor {

	//float percentualImpostos = Float.parseFloat(JOptionPane.showInputDialog("Informe o percentual de impostos"));

	
	public static void main(String[] args) {

		double precoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o de f�brica"));
		double lucroDistribuidor = Double.parseDouble(JOptionPane.showInputDialog("Informe o % de lucro do distribuidor"));
		double percentualImpostos = Double.parseDouble(JOptionPane.showInputDialog("Informe o % dos impostos"));

		lucroDistribuidor = (precoFabrica * lucroDistribuidor);
		percentualImpostos = (precoFabrica * percentualImpostos);
		System.out.println("O lucro do distribuidor �: " + lucroDistribuidor);
		System.out.println("O valor correspondente aos impostos �: " + percentualImpostos);
		System.out.println("O pre�os final do ve�culo �: " + (precoFabrica + lucroDistribuidor + percentualImpostos));
	
	}

}
