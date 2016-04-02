package br.edu.uniritter.seleniumDecolar;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCadastroEmailDiferente {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.zapimoveis.com.br/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCadastroEmailDiferente() throws Exception {	
    driver.get(baseUrl + "/");
  //  driver.findElement(By.id("lnkCadastroHeader")).click();
    driver.findElement(By.id("txtNomeCadastro")).click();
    driver.findElement(By.id("txtNomeCadastro")).click();
    driver.findElement(By.id("txtNomeCadastro")).click();
    driver.findElement(By.id("txtNomeCadastro")).clear();
    driver.findElement(By.id("txtNomeCadastro")).sendKeys("Teste Selenium");
    driver.findElement(By.id("txtEmailCadastro")).click();
    driver.findElement(By.id("txtEmailCadastro")).clear();
    driver.findElement(By.id("txtEmailCadastro")).sendKeys("allynbernardi@gmail.com");
    driver.findElement(By.id("txtConfirmaEmailCadastro")).click();
    driver.findElement(By.id("txtConfirmaEmailCadastro")).click();
    driver.findElement(By.id("txtConfirmaEmailCadastro")).clear();
    driver.findElement(By.id("txtConfirmaEmailCadastro")).sendKeys("allynebernardi@gmail.com");
    driver.findElement(By.id("txtSenhaCadastro")).click();
    driver.findElement(By.id("txtSenhaCadastro")).click();
    driver.findElement(By.id("txtSenhaCadastro")).clear();
    driver.findElement(By.id("txtSenhaCadastro")).sendKeys("ihu287f2@");
    driver.findElement(By.id("txtConfirmaSenhaCadastro")).click();
    driver.findElement(By.id("txtConfirmaSenhaCadastro")).clear();
    driver.findElement(By.id("txtConfirmaSenhaCadastro")).sendKeys("ihu287f2@");
    driver.findElement(By.cssSelector("label.clear")).click();
    driver.findElement(By.id("chkNovidades")).click();
    driver.findElement(By.id("btnConfirmarCadastro")).click();
    driver.findElement(By.id("txtEmailCadastro")).click();
    driver.findElement(By.id("txtEmailCadastro")).click();
    driver.findElement(By.id("txtEmailCadastro")).click();
    driver.findElement(By.id("txtEmailCadastro")).clear();
    driver.findElement(By.id("txtEmailCadastro")).sendKeys("allynebernardi@gmail.com");
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
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
