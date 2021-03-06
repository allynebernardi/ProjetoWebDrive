package br.edu.uniritter.OpServices;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;

import br.edu.uniritter.interacao.DownloadInteracao;

public class TestDownloadEmailInvalido {

	private StringBuffer verificationErrors = new StringBuffer();
	private DownloadInteracao downloadInteracao;
	private boolean acceptNextAlert = true;
	
	@Before
	public void setUp() throws Exception {
		Util.init();
		downloadInteracao = new DownloadInteracao();
	}

	@Test
	public void testEmailInvaLido() throws Exception {

		Util.driver.get(Util.URL_BASE + "download/");
		downloadInteracao.PaginaInicial();
		downloadInteracao.Cadastro();
		downloadInteracao.clearName();
		downloadInteracao.inputName();
		downloadInteracao.clearProfissao();
		downloadInteracao.inputProfissao();
		downloadInteracao.clearEmail();
		downloadInteracao.inputEmail();
		downloadInteracao.clearTelefone();
		downloadInteracao.inputTelefone();
		downloadInteracao.clearEmpresa();
		downloadInteracao.inputEmpresa();
		downloadInteracao.clearCidade();
		downloadInteracao.inputCidade();
		downloadInteracao.clearEstado();
		downloadInteracao.inputEstado();
		downloadInteracao.Download();

	}

	@After
	public void tearDown() throws Exception {
		Util.driver.quit();
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
