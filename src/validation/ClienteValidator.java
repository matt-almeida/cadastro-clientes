package validation;

public class ClienteValidator {
	
	public static void validarNome(String nome) {
		if (nome == null || nome.isBlank()) {
			throw new IllegalArgumentException("Nome inválido");
		}
	}
	
	public static void validarEmail(String email) {
		if (email == null || email.isBlank() || !email.contains("@")) {
			throw new IllegalArgumentException("Email inválido");
		}
	}
	
	public static void validarTelefone(String telefone) {
		if (telefone == null || telefone.isBlank()) {
			throw new IllegalArgumentException("Telefone inválido");
		}
	}

}
