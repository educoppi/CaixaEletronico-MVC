package view;

import model.Usuario;

public class UsuarioView {

	public void exibirSaldo(Usuario usuario) {
		System.out.println("Saldo: R$ " + usuario.getSaldo() + "\n");
	}

	public void saqueExcedeSaldo() {
		System.out.println("\n== Operação interrompida ==");
		System.out.println("O valor de saque excede o valor contido em seu saldo.\n");
	}

	public void saqueEfetuado(double saque) {
		System.out.println("Saque efetuado no valor de R$ " + saque);
	}

	public void depositoEfetuado(double deposito) {
		System.out.println("Deposito efetuado no valor de R$ " + deposito);
	}

	public void exibirMenu() {
		System.out.println("1 - Consultar Saldo");
		System.out.println("2 - Sacar");
		System.out.println("3 - Depositar");
		System.out.println("0 - Sair");
		System.out.printf("Selecione uma das opcoes: ");
	}

	public void exibeConsultaSaldo() {
		System.out.println("== Consultar Saldo == \n");
	}

	public void exibeOperacaoSacar() {
		System.out.println("== Sacar == \n");
		System.out.printf("Insira a quantidade que deseja sacar: ");
	}

	public void exibeOperacaoDepositar() {
		System.out.println("== Depositar == \n");
		System.out.printf("Insira o valor que deseja depositar: ");
	}

	public void exibeSair() {
		System.out.println("Saindo...");
	}

	public void exibeDefault() {
		System.out.println("Opcao invalida.\n");
	}
}
