package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By nome = By.id("userName");
	private By password = By.id("userPassword");
	private By email = By.id("userEmail");
	private By telefone = By.id("phone");
	private By btnAdicionar = By.xpath("//p[text()='Adicionar']");
	private By especialidade = By.id("jobSpecialty");
	private By cpf = By.id("userDoc");
	private By profissao = By.id("job");

	public By getNome() {
		return nome;
	}

	public By getPassword() {
		return password;
	}

	public By getEmail() {
		return email;
	}

	public By getTelefone() {
		return telefone;
	}

	public By getBtnAdicionar() {
		return btnAdicionar;
	}
	public By getEspecialidade() {
		return especialidade;
	}
	public By getCpf() {
		return cpf;
	}
	public By getProfissao() {
		return profissao;
	}
}
