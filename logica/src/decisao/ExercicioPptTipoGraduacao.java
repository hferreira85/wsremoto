package decisao;

import javax.swing.JOptionPane;

/*Monte o c�digo que solicite ao usu�rio o tipo de gradua��o que realiza.
* Se o usu�rio entrar com Tecn�logo, o sistema dever� exibir 2 at� 3 anos.
* Se o usu�rio entrar com Bacharelado, o sistema dever� exibir 4 at� 6 anos.
*/

public class ExercicioPptTipoGraduacao {

	public static void main(String[] args) {
		String graduacao = JOptionPane.showInputDialog("Informe se sua gradua��o � Tecnologo ou Bacharelado");
		if (graduacao.equals("tecnologo")){
			System.out.println("Seu curso dura de 2 a 3 anos");
		}else if(graduacao.equals("bacharelado")){
			System.out.println("Seu curso dura de 4 � 6 anos");
		}else {
			System.out.println("Curso invalido");
		}
			
			
	}

}
