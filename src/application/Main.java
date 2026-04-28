package application;

import java.util.Scanner;

import model.Cliente;
import repository.ClienteRepository;
import service.ClienteService;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ClienteService service = new ClienteService(new ClienteRepository());
		
		while (true) {
			System.out.println("\n1 - Criar cliente");
			System.out.println("2 - Listar clientes");
			System.out.println("3 - Deletar clientes");
			System.out.println("4 - Buscar cliente por ID");
			System.out.println("0 - Sair");
			
			int opcao = sc.nextInt();
			sc.nextLine();
			
			switch (opcao) {
			case 1:
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				
				System.out.print("Email: ");
				String email = sc.nextLine();
				
				System.out.print("Telefone: ");
				String telefone = sc.nextLine();
				
				System.out.print("CPF: ");
				String cpf = sc.nextLine();
				
				try {
					service.criar(nome, email, telefone, cpf);
					System.out.println("Cliente criado com sucesso!");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 2:
				for (Cliente c : service.listar()) {
					System.out.println(c.getId() + " - " + c.getNome());
				}
				break;
				
			case 3:
				System.out.print("ID para deletar: ");
				Long id = sc.nextLong();
				
				try {
					service.deletar(id);
					System.out.println("Cliente removido!");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 4:
			    System.out.print("ID: ");
			    Long idBusca = sc.nextLong();

			    try {
			        Cliente cliente = service.buscarPorId(idBusca);
			        System.out.println(cliente);
			    } catch (Exception e) {
			        System.out.println(e.getMessage());
			    }
			    break;	
				
			case 0:
				return;
				
			default:
				System.out.println("Opção inválida!");
			}
		}
	}

}
