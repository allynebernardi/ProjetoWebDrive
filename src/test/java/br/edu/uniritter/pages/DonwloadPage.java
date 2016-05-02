package br.edu.uniritter.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import br.edu.uniritter.OpServices.Util;;

public class DonwloadPage {
	@FindBy (linkText = "OpServices - Gerenciamento de TI e Processos de Negócios")
    protected WebElement paginaInicial;
	
	@FindBy (id = "featured-button-download")
    protected WebElement cadastro;
	
	@FindBy (id = "Fale Conosco")
    protected WebElement faleConosco;
	
	@FindBy(id = "fname")
	protected WebElement nome;
	
	@FindBy(id = "lname")
	protected WebElement profissao;

	@FindBy(name = "email")
	protected WebElement email;
	
	@FindBy(name = "telefone")
	protected WebElement telefone;
	
	@FindBy(name = "empresa")
	protected WebElement empresa;
	
	@FindBy(name = "cidade")
	protected WebElement cidade;

	@FindBy(name = "estado")
	protected WebElement estado;
	
	@FindBy(name = "input.wpcf7-form-control.wpcf7-submit")
	protected WebElement download;

		
	public DonwloadPage(){
		PageFactory.initElements(Util.driver, this);
	}

	


	
}
