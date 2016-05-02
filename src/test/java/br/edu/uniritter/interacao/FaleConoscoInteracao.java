package br.edu.uniritter.interacao;

import org.openqa.selenium.By;

import br.edu.uniritter.pages.DonwloadPage;

public class FaleConoscoInteracao extends DonwloadPage {

	public void PaginaInicial() {
		faleConosco.click();
	}

	public void clearName() {
		nome.clear();
	}

	public void inputName() {
		nome.sendKeys("teste Fale Conosco");
	}

	public void clearProfissao() {
		profissao.clear();
	}

	public void inputProfissao() {
		profissao.sendKeys("Teste");
	}

	public void clearEmail() {
		email.clear();
	}

	public void inputEmail() {
		email.sendKeys("teste@gmail");
	}

	public void clearTelefone() {
		telefone.clear();
	}

	public void inputTelefone() {
		telefone.sendKeys("111111111111111111");
	}

	public void clearEmpresa() {
		empresa.clear();
	}

	public void inputEmpresa() {
		empresa.sendKeys("2234567");
	}

	public void clearCidade() {
		cidade.clear();
	}

	public void inputCidade() {
		cidade.sendKeys("Porto Alegre");
	}

	public void clearEstado() {
		estado.clear();
	}

	public void inputEstado() {
		estado.sendKeys("RS");
	}

	public void Download() {
		download.click();
	}

}
