package br.edu.uniritter.interacao;

import org.openqa.selenium.By;

import br.edu.uniritter.pages.DonwloadPage;;

public class DonwloadInteracao extends DonwloadPage {

	public void PaginaInicial() {
		paginaInicial.click();
	}

	public void Cadastro() {
		cadastro.click();
	}

	public void clearName() {
		nome.clear();
	}

	public void inputName() {
		nome.sendKeys("Aline");
	}

	public void clearProfissao() {
		profissao.clear();
	}

	public void inputProfissao() {
		profissao.sendKeys("Analista de sistemas");
	}

	public void clearEmail() {
		email.clear();
	}

	public void inputEmail() {
		email.sendKeys("a");
	}

	public void clearTelefone() {
		telefone.clear();
	}

	public void inputTelefone() {
		telefone.sendKeys("111111111111");
	}

	public void clearEmpresa() {
		empresa.clear();
	}

	public void inputEmpresa() {
		empresa.sendKeys("Senior");
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
		estado.sendKeys("Rio");
	}

	public void Download() {
		download.click();
	}

}
