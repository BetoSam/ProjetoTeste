package steps;

import org.junit.Before;

import elementos.Elementos;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import login.ProntoParaTeste;
import metodos.Metodos;
import runner.Executa;

public class TestandoLoginTeste {
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	ProntoParaTeste Pb = new ProntoParaTeste();

	@Before
	public void iniciarteste() {

	}

	@After
	public void fechaNavegador() {
		// Executa.fecharNavegador();
	}

	@Given("que esteja na pagina de login")
	public void queEstejaNaPaginaDeLogin() {
		Executa.abrirNavegador();
		Pb.casdastroRealizado();
	}

	@When("digitar o nome")
	public void digitarONome() {
		metodo.escrever(el.getNome(), "João Roberto Santos ");
	}

	@When("digitar   email")
	public void digitarEmail() {
		metodo.escrever(el.getEmail(), "joaoroberto@uorak.com");
	}

	@When("digitar  senha")
	public void digitarSenha() {
		metodo.escrever(el.getPassword(), "12334434");
	}

	@Then("o cadastro devera ser realizado com sucesso")
	public void oCadastroDeveraSerRealizadoComSucesso() {
		metodo.clicar(el.getBtnAdicionar());
		metodo.pausa(2000);
		metodo.tirarPrint("cadastro realizado com sucesso");
	}

	@When("digitar telefone")
	public void digitarTelefone() {
		metodo.escrever(el.getTelefone(), "1198434-1820");
	}

	@When("digitar cpf")
	public void digitarCpf() {
		metodo.escrever(el.getCpf(), "752.690.490-58");
	}

	@When("digitar especialidade")
	public void digitarEspecialidade() {
		metodo.escrever(el.getEspecialidade(), "Ansiedade");
	}

	@When("profissao")
	public void profissao() {
		metodo.escrever(el.getProfissao(), "Terapeuta");
	}

}
