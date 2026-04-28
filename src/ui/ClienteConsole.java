package ui;

import java.util.Scanner;

import model.Cliente;
import service.ClienteService;

public class ClienteConsole {

	private ClienteService service;
	private Scanner sc = new Scanner(System.in);

	public ClienteConsole(ClienteService service) {
		this.service = service;
	}

	public void iniciar() {
		while (true) {
			System.out.println("\n1 - Criar cliente");
			System.out.println("2 - Listar clientes");
			System.out.println("3 - Deletar cliente");
			System.out.println("4 - Buscar por ID");
			System.out.println("5 - Atualizar cliente");
			System.out.println("0 - Sair");

			int opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1 -> criar();
			case 2 -> listar();
			case 3 -> deletar();
			case 4 -> buscar();
			case 5 -> atualizar();
			case 0 -> {
				return;
			}
			default -> System.out.println("Opção inválida!");
			}
		}
	}

	private void criar() {
		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.print("Email: ");
		String email = sc.nextLine();

		System.out.print("Telefone: ");
		String telefone = sc.nextLine();

		System.out.print("CPF: ");
		String cpf = sc.nextLine();

		try {
			Cliente cliente = service.criar(nome, email, telefone, cpf);
			System.out.println("Cliente criado com sucesso: " + cliente);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private void listar() {
		for (Cliente c : service.listar()) {
			System.out.println(c);
		}
	}

	private void deletar() {
		System.out.print("ID: ");
		Long id = sc.nextLong();

		try {
			service.deletar(id);
			System.out.println("Cliente removido!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private void buscar() {
		System.out.print("ID: ");
		Long id = sc.nextLong();

		try {
			System.out.println(service.buscarPorId(id));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private void atualizar() {
		System.out.print("ID: ");
		Long id = sc.nextLong();
		sc.nextLine();

		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.print("Email: ");
		String email = sc.nextLine();

		System.out.print("Telefone: ");
		String telefone = sc.nextLine();

		try {
			service.atualizar(id, nome, email, telefone);
			System.out.println("Cliente atualizado com sucesso!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
