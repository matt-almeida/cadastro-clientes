package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import model.Cliente;

public class ClienteRepository {

	private List<Cliente> clientes = new ArrayList<>();
	
	public void salvar(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public List<Cliente> listar() {
		return clientes;
	}
	
	public Optional<Cliente> buscarPorId(Long id) {
		return clientes.stream()
				.filter(c -> c.getId().equals(id)).
				findFirst();
	}
	
	public Optional<Cliente> buscarPorCpf(String cpf) {
		return clientes.stream()
				.filter(c -> c.getCpf().equals(cpf))
				.findFirst();
	}
	
	public void deletar(Cliente cliente) {
		clientes.remove(cliente);
	}
}
