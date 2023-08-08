package controller;

import java.util.Scanner;

import model.Usuario;
import view.UsuarioView;

public class UsuarioController {

	private UsuarioView usuarioView = new UsuarioView();

	public void consultaSaldo(Usuario usuario) {
		usuarioView.exibirSaldo(usuario);
	}

	public void saca(double saque, Usuario usuario) {
		if (saque > usuario.getSaldo()) {
			usuarioView.saqueExcedeSaldo();
			return;
		}

		usuario.setSaldo(usuario.getSaldo() - saque);

		usuarioView.saqueEfetuado(saque);
		usuarioView.exibirSaldo(usuario);
	}

	public void deposita(double deposito, Usuario usuario) {

		usuario.setSaldo(deposito + usuario.getSaldo());

		usuarioView.depositoEfetuado(deposito);
		usuarioView.exibirSaldo(usuario);
	}

	public void menu(Scanner input, Usuario usuario, UsuarioController uController) {
		int check = -1;
		while (check != 0) {
			usuarioView.exibirMenu();
			check = input.nextInt();

			switch (check) {
			case 1 -> {
				usuarioView.exibeConsultaSaldo();
				uController.consultaSaldo(usuario);
			}
			case 2 -> {
				usuarioView.exibeOperacaoSacar();
				double saque = input.nextDouble();

				uController.saca(saque, usuario);
			}
			case 3 -> {
				usuarioView.exibeOperacaoDepositar();
				double deposito = input.nextDouble();

				uController.deposita(deposito, usuario);
			}
			case 0 -> {
				usuarioView.exibeSair();
			}
			default -> {
				usuarioView.exibeDefault();
			}
			}
		}
		input.close();
	}
}
