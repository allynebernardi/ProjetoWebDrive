
package br.edu.uniritter.seleniumDecolar;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCadastroEmailDiferente {
private WebDriver driver;
private String baseUrl;
private StringBuffer verificationErrors = new StringBuffer();

@Before
public void setUp() throws Exception {
driver = new FirefoxDriver();
baseUrl = "http://www.skoob.com.br/";
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

@Test
public void testCadastroSkoob() throws Exception {
driver.get(baseUrl + "/");
driver.findElement(By.linkText("Entrar")).click();
driver.findElement(By.id("UsuarioEmail")).clear();
driver.findElement(By.id("UsuarioEmail")).sendKeys("yalis.couto@gmail.com");
driver.findElement(By.id("UsuarioSenha")).clear();
driver.findElement(By.id("UsuarioSenha")).sendKeys("skoob123");
driver.findElement(By.name("data[Login][automatico]")).click();
driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
}

@After
public void tearDown() throws Exception {
driver.quit();
String verificationErrorString = verificationErrors.toString();
if (!"".equals(verificationErrorString)) {
fail(verificationErrorString);
}
}

}