package br.edu.uniritter.OpServices;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestFaleConoscoSemAssunto {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.opservices.com.br/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testFaleComoscoSemAssunto() throws Exception {
    driver.get(baseUrl + "/download-sucesso/?ppt=c3de7eba6ad2fee1c3eeeefdd04cf6bd");
    driver.findElement(By.linkText("Fale Conosco")).click();
    driver.findElement(By.id("fname")).clear();
    driver.findElement(By.id("fname")).sendKeys("Teste Fale Conosco Sem Assunto");
    driver.findElement(By.id("lname")).clear();
    driver.findElement(By.id("lname")).sendKeys("Teste");
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("Teste@gmail.com");
    driver.findElement(By.name("telefone")).clear();
    driver.findElement(By.name("telefone")).sendKeys("111111111111111111");
    driver.findElement(By.name("empresa")).clear();
    driver.findElement(By.name("empresa")).sendKeys("Teste");
    driver.findElement(By.name("cidade")).clear();
    driver.findElement(By.name("cidade")).sendKeys("Porto Alegre");
    driver.findElement(By.name("estado")).clear();
    driver.findElement(By.name("estado")).sendKeys("RS");
    driver.findElement(By.name("mensagem")).clear();
    driver.findElement(By.name("mensagem")).sendKeys("teste");
    driver.findElement(By.cssSelector("input.wpcf7-form-control.wpcf7-submit")).click();
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
