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
import br.edu.uniritter.interacao.FaleConnoscoSemAssuntoInteracao;

public class TestFaleConoscoSemAssunto {
	private StringBuffer verificationErrors = new StringBuffer();
	private FaleConnoscoSemAssuntoInteracao faleconosco;
	private boolean acceptNextAlert = true;
	
	@Before
	public void setUp() throws Exception {
		Util.init();
		faleconosco = new FaleConnoscoSemAssuntoInteracao();
	}
  @Test
  public void testFaleComoscoSemAssunto() throws Exception {
	  
	  
	  Util.driver.get(Util.URL_BASE + "fale-conosco/");
	  faleconosco.PaginaInicial();
	  faleconosco.clearName();
	  faleconosco.inputName();
	  faleconosco.clearProfissao();
	  faleconosco.inputProfissao();
	  faleconosco.clearEmail();
	  faleconosco.inputEmail();
	  faleconosco.clearTelefone();
	  faleconosco.inputTelefone();
	  faleconosco.clearEmpresa();
	  faleconosco.inputEmpresa();
	  faleconosco.clearCidade();
	  faleconosco.inputCidade();
	  faleconosco.clearEstado();
	  faleconosco.inputEstado();
	  faleconosco.Download();
  
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
