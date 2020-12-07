package decisao;

import javax.swing.JOptionPane;

/*Monte o código que solicite ao usuário o tipo de graduação que realiza.
* Se o usuário entrar com Tecnólogo, o sistema deverá exibir 2 até 3 anos.
* Se o usuário entrar com Bacharelado, o sistema deverá exibir 4 até 6 anos.
*/

public class ExercicioPptTipoGraduacao {

	public static void main(String[] args) {
		String graduacao = JOptionPane.showInputDialog("Informe se sua graduação é Tecnologo ou Bacharelado");
		if (graduacao.equals("tecnologo")){
			System.out.println("Seu curso dura de 2 a 3 anos");
		}else if(graduacao.equals("bacharelado")){
			System.out.println("Seu curso dura de 4 à 6 anos");
		}else {
			System.out.println("Curso invalido");
		}
			
			
	}

}
