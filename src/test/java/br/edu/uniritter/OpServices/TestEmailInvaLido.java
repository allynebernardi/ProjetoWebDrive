package br.edu.uniritter.OpServices;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestEmailInvaLido {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com.br/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testEmailInvLido() throws Exception {
    driver.get(baseUrl + "/#q=opservices&gws_rd=cr");
    driver.findElement(By.linkText("OpServices - Gerenciamento de TI e Processos de Negócios")).click();
    driver.findElement(By.id("featured-button-download")).click();
    driver.findElement(By.id("fname")).clear();
    driver.findElement(By.id("fname")).sendKeys("Aline");
    driver.findElement(By.id("lname")).clear();
    driver.findElement(By.id("lname")).sendKeys("Analista de sistemas");
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("a");
    driver.findElement(By.name("telefone")).clear();
    driver.findElement(By.name("telefone")).sendKeys("111111111111");
    driver.findElement(By.name("empresa")).clear();
    driver.findElement(By.name("empresa")).sendKeys("Senior");
    driver.findElement(By.name("cidade")).clear();
    driver.findElement(By.name("cidade")).sendKeys("Porto Alegre");
    driver.findElement(By.name("estado")).clear();
    driver.findElement(By.name("estado")).sendKeys("Rio");
    driver.findElement(By.name("estado")).clear();
    driver.findElement(By.name("estado")).sendKeys("RS");
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
