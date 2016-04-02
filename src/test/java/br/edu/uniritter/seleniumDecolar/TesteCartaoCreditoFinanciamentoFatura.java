package br.edu.uniritter.seleniumDecolar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TesteCartaoCreditoFinanciamentoFatura {
private WebDriver driver;
private String baseUrl;
private boolean acceptNextAlert = true;
private StringBuffer verificationErrors = new StringBuffer();

@Before
public void setUp() throws Exception {
driver = new FirefoxDriver();
baseUrl = "https://www3.bcb.gov.br/";
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}

@Test
public void testECartaoCreditoFinanciamentoFatura() throws Exception {
driver.get(baseUrl + "/CALCIDADAO/jsp/index.jsp");
driver.findElement(By.linkText("Cart\u00E3o de Cr\u00E9dito: financiamento da fatura")).click();
driver.findElement(By.id("valortotal1")).clear();
driver.findElement(By.id("valortotal1")).sendKeys("1524");
driver.findElement(By.id("txjurosanual1")).clear();
driver.findElement(By.id("txjurosanual1")).sendKeys("8");
driver.findElement(By.cssSelector("input.botao")).click();
try {
assertEquals("O pagamento mensal não pode ser inferior a 228.6, que corresponde a 15% do total da fatura.", driver.findElement(By.cssSelector("#resposta1 > span")).getText());
} catch (Error e) {
verificationErrors.append(e.toString());
}
driver.findElement(By.id("pagamentomensal1")).clear();
driver.findElement(By.id("pagamentomensal1")).sendKeys("325");
driver.findElement(By.cssSelector("input.botao")).click();
Thread.sleep(3000);
try {
assertEquals("Leva 4,7 parcelas de R$ 325,00 por m\u00EAs at\u00E9 quitar a sua fatura de R$ 1.524,00 do cart\u00E3o de cr\u00E9dito. Vai custar no total R$ 1.542,56, sendo R$ 18,56 de juros. Pagando dessa forma, voc\u00EA fez uma d\u00EDvida chamada \"cr\u00E9dito rotativo\".", driver.findElement(By.id("resposta1")).getText());
} catch (Error e) {
verificationErrors.append(e.toString());
}
driver.findElement(By.id("valortotal1")).clear();
driver.findElement(By.id("valortotal1")).sendKeys("");
driver.findElement(By.cssSelector("input.botao")).click();
Thread.sleep(3000);
try {
assertEquals("Todos os campos devem ser preenchidos corretamente.", driver.findElement(By.cssSelector("#resposta1 > span")).getText());
} catch (Error e) {
verificationErrors.append(e.toString());
}
}

@After
public void tearDown() throws Exception {
// driver.quit();
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