package br.com.universidadexyz.implementacao;

import javax.swing.JOptionPane;

import br.com.universidadexyz.beans.Curso;

public class ImplementarCurso {

	public static void main(String[] args) {

		Curso curso = new Curso();
		curso.setAll(
				JOptionPane.showInputDialog("Descri��o"),
				Float.parseFloat(JOptionPane.showInputDialog("Valor")),
				Short.parseShort(JOptionPane.showInputDialog("CargaHoraria")),
				JOptionPane.showInputDialog("sigla")

				);
		
		
		
	}

}
