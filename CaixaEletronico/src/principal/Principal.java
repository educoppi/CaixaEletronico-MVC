package principal;

import java.util.Scanner;

import controller.UsuarioController;
import model.Usuario;

public class Principal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Usuario usuario = new Usuario();
		UsuarioController uController = new UsuarioController();

		uController.menu(input, usuario, uController);
	}
}
