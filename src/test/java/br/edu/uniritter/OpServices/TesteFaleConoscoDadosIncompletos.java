package br.edu.uniritter.OpServices;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import br.edu.uniritter.interacao.DownloadInteracao;
import br.edu.uniritter.interacao.FaleConoscoInteracao;

public class TesteFaleConoscoDadosIncompletos {
	private StringBuffer verificationErrors = new StringBuffer();
	private FaleConoscoInteracao faleconoscointeracao;
	private boolean acceptNextAlert = true;

	public void setUp() throws Exception {
		Util.init();
		faleconoscointeracao = new FaleConoscoInteracao();
	}

	@Test
	public void testeFaleConoscoDadosIncompletos() throws Exception {
		Util.driver.get(Util.URL_BASE + "fale-conosco/");

		faleconoscointeracao.PaginaInicial();
		faleconoscointeracao.clearName();
		faleconoscointeracao.inputName();
		faleconoscointeracao.clearProfissao();
		faleconoscointeracao.inputProfissao();
		faleconoscointeracao.clearEmail();
		faleconoscointeracao.inputEmail();
		faleconoscointeracao.clearTelefone();
		faleconoscointeracao.inputTelefone();
		faleconoscointeracao.clearEmpresa();
		faleconoscointeracao.inputEmpresa();
		faleconoscointeracao.clearCidade();
		faleconoscointeracao.inputCidade();
		faleconoscointeracao.clearEstado();
		faleconoscointeracao.inputEstado();
		faleconoscointeracao.Download();

	}

	@After
	public void tearDown() throws Exception {
		//Util.driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			Util.driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			Util.driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = Util.driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
