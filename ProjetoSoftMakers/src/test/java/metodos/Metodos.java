package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import drivers.Drivers;

public class Metodos extends Drivers {

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void validarMensagem(String urlEsperada) {
		assertEquals(urlEsperada, driver.getCurrentUrl());

	}

	public void validarMensagem2(By elemento, String msgCapturada) {
		String msgEsperada = driver.findElement(elemento).getText();
		assertEquals(msgCapturada, msgEsperada);
	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void tirarPrint(String nomeEvidencia) {
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File("./evidencias/" + nomeEvidencia + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void pausa (int tempo ) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
