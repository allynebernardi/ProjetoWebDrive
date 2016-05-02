package br.edu.uniritter.interacao;

import org.openqa.selenium.By;

import br.edu.uniritter.pages.DonwloadPage;

public class FaleConnoscoSemAssuntoInteracao extends DonwloadPage {


		public void PaginaInicial() {
			faleConosco.click();
		}

		public void clearName() {
			nome.clear();
		}

		public void inputName() {
			nome.sendKeys("Teste Fale Conosco Sem Assunto");
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
			email.sendKeys("teste@gmail.com");
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
			cidade.sendKeys("SeniorABD");
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
		
		public void clearMensagem() {
			mensagem.clear();
		}

		public void inputMensagem() {
			mensagem.sendKeys("Teste");
		}

		public void Download() {
			download.click();
		}

	}

