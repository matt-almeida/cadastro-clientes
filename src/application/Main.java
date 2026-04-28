package application;

import repository.ClienteRepository;
import service.ClienteService;
import ui.ClienteConsole;

public class Main {

	public static void main(String[] args) {

		ClienteService service = new ClienteService(new ClienteRepository());
		new ClienteConsole(service).iniciar();
	}

}
