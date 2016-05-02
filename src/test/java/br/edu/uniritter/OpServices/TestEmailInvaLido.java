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

public class TestEmailInvalido {

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

		Util.driver.get(Util.URL_BASE + "/#q=opservices&gws_rd=cr");
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
