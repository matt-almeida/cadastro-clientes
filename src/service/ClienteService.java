package service;

import java.util.List;

import model.Cliente;
import repository.ClienteRepository;

public class ClienteService {
	
	private ClienteRepository repository;
	private Long contadorId = 1L;
	
	public ClienteService(ClienteRepository repository) {
		this.repository = repository;
	}
	
	public Cliente criar(String nome, String email, String telefone, String cpf) {
		if (repository.buscarPorCpf(cpf).isPresent()) {
			throw new RuntimeException("CPF já cadastrado!");
		}
		
		Cliente cliente = new Cliente(contadorId++, nome, email, telefone, cpf);
		repository.salvar(cliente);
		
		return cliente;
		
	}
	
	public List<Cliente> listar() {
		return repository.listar();
	}
	
	public Cliente buscarPorId(Long id) {
		return repository.buscarPorId(id)
				.orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
	}
	
	public void atualizar(Long id, String nome, String email, String telefone) {
		Cliente cliente = buscarPorId(id);
		
		cliente.setNome(nome);
		cliente.setEmail(email);
		cliente.setTelefone(telefone);
	}
	
	public void deletar(Long id) {
		Cliente cliente = buscarPorId(id);
		repository.deletar(cliente);
	}

}
