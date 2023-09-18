package login;

import org.openqa.selenium.By;

import metodos.Metodos;

public class ProntoParaTeste {
	Metodos metodo = new Metodos();
	 private By email =  By.id("email") ;
	By senha = By.id("password");
	By btnLogin = By.xpath("//button[@type='submit']");
	By btnTerapeutas = By.xpath("//*[text()='Terapeutas']");
	By btnAdcionar = By.xpath("//*[text()='Adicionar']"); 
public void casdastroRealizado() {
	metodo.escrever(email, "interato.softmakers@gmail.com");
		metodo.escrever(senha , "XFeh%lRgL02TPE98");
		metodo.clicar(btnLogin);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		metodo.clicar(btnTerapeutas);
		metodo.clicar(btnAdcionar);
	}

}
