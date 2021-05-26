package br.com.foursys.locadora.backingbean;

import java.util.ArrayList;

import br.com.foursys.locadora.bean.Filme;
import br.com.foursys.locadora.controller.FilmeController;
import br.com.foursys.locadora.util.JSFUtil;
import br.com.foursys.locadora.util.Valida;

/**
 * Classe responsável por controlar os componentes do front-end Filme
 * 
 * @author Renato Sampaio
 * @since 27/04/2021
 * @version 1.0
 */
public class FilmeBacking {

	// atributos da tela de cadastro
	private String nome;
	private String valor;
	private String disponivel;
	private String promocao;
	private String valorPromocao;
	private String diretor;
	private String anoLancamento;
	private String faixaEtaria;
	private String genero;

	// atributos da tela de consulta
	private String nomePesquisar;
	private Filme filmeSelecionado;

	// atributos auxiliares
	private Filme filme;
	private ArrayList<Filme> listaFilmes;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(String disponivel) {
		this.disponivel = disponivel;
	}

	public String getPromocao() {
		return promocao;
	}

	public void setPromocao(String promocao) {
		this.promocao = promocao;
	}

	public String getValorPromocao() {
		return valorPromocao;
	}

	public void setValorPromocao(String valorPromocao) {
		this.valorPromocao = valorPromocao;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public ArrayList<Filme> getListaFilmes() {
		return listaFilmes;
	}

	public void setListaFilmes(ArrayList<Filme> listaFilmes) {
		this.listaFilmes = listaFilmes;
	}

	public String getNomePesquisar() {
		return nomePesquisar;
	}

	public void setNomePesquisar(String nomePesquisar) {
		this.nomePesquisar = nomePesquisar;
	}

	public Filme getFilmeSelecionado() {
		return filmeSelecionado;
	}

	public void setFilmeSelecionado(Filme filmeSelecionado) {
		this.filmeSelecionado = filmeSelecionado;
	}

	/*
	 * método que captura a ação do botão CADASTRAR na tela cad-filme.jsp
	 */
	public void cadastrar() {

		if (validar()) {

			try {
				getFilme();
				new FilmeController().salvar(filme);
				limparCampos();
				JSFUtil.addInfoMessage("Filme gravado com sucesso!");
			} catch (Exception e) {
				JSFUtil.addErrorMessage("Erro ao cadastrar o filme!");
			}

		}

	}
	
	public void alterarFilme() {

		if (validar()) {

			try {
				getFilmeAlterar();
				new FilmeController().salvar(filme);
				limparCampos();
				JSFUtil.addInfoMessage("Filme alterado com sucesso!");
			} catch (Exception e) {
				JSFUtil.addErrorMessage("Erro ao alterar o filme!");
			}

		}

	}

	private boolean validar() {

		if (Valida.isEmptyOrNull(nome)) {
			JSFUtil.addErrorMessage("Informe o nome, campo obrigatório!");
			return false;
		}

		if (!Valida.isDouble(valor)) {
			JSFUtil.addErrorMessage("Informe o valor, campo obrigatório!");
			return false;
		} else if (Valida.isDoubleZero(Double.parseDouble(valor))) {
			JSFUtil.addErrorMessage("Informe um valor válido!");
			return false;
		}

		if (Valida.isEmptyOrNull(disponivel)) {
			JSFUtil.addErrorMessage("Informe a disponibilidade, campo obrigatório!");
			return false;
		}

		if (Valida.isEmptyOrNull(promocao)) {
			JSFUtil.addErrorMessage("Informe a promoção, campo obrigatório!");
			return false;
		}

		if (promocao.equals("Sim")) {
			if (!Valida.isDouble(valorPromocao)) {
				JSFUtil.addErrorMessage("Informe o valor da promoção, campo obrigatório!");
				return false;
			} else if (Valida.isDoubleZero(Double.parseDouble(valorPromocao))) {
				JSFUtil.addErrorMessage("Informe um valor da promoção válido!");
				return false;
			}
		}

		if (Valida.isEmptyOrNull(diretor)) {
			JSFUtil.addErrorMessage("Informe o diretor, campo obrigatório!");
			return false;
		}

		if (!Valida.isInteger(anoLancamento)) {
			JSFUtil.addErrorMessage("Informe o ano de lançamento, campo obrigatório!");
			return false;
		} else if (Valida.isIntZero(Integer.parseInt(anoLancamento))) {
			JSFUtil.addErrorMessage("Informe um ano de lançamento válido!");
			return false;
		}

		if (!Valida.isInteger(faixaEtaria)) {
			JSFUtil.addErrorMessage("Informe a faixa etária, campo obrigatório!");
			return false;
		} else if (Valida.isIntZero(Integer.parseInt(faixaEtaria))) {
			JSFUtil.addErrorMessage("Informe uma faixa etária válida!");
			return false;
		}

		if (Valida.isEmptyOrNull(genero)) {
			JSFUtil.addErrorMessage("Informe o gênero, campo obrigatório!");
			return false;
		}

		return true;
	}

	/*
	 * método que captura a ação do botão CANCELAR na tela cad-filme.jsp
	 */
	public void cancelar() {

	}

	/*
	 * método que captura a ação do botão SAIR na tela cad-filme.jsp
	 */
	public String sair() {
		return "sair";
	}

	/*
	 * método para abrir a tela de cadastro
	 */
	public String cadastroFilme() {
		limparCampos();
		return "";
	}

	/*
	 * método para abrir a tela de consulta
	 */
	public String consultarFilme() {
		nomePesquisar = null;
		listaFilmes = null;
		return "";
	}

	/*
	 * método para retornar um objeto Filme
	 */
	private void getFilme() {
		filme = new Filme();
		filme.setNome(nome);
		filme.setValor(Double.parseDouble(valor));
		filme.setDisponivel(disponivel);
		filme.setPromocao(promocao);

		if (promocao.equals("Sim")) {
			filme.setValorPromocao(Double.parseDouble(valorPromocao));
		}

		filme.setDiretor(diretor);
		filme.setAnoLancamento(anoLancamento);
		filme.setFaixaEtaria(Integer.parseInt(faixaEtaria));
		filme.setGenero(genero);
	}
	
	private void getFilmeAlterar() {
		filme = filmeSelecionado;
		filme.setNome(nome);
		filme.setValor(Double.parseDouble(valor));
		filme.setDisponivel(disponivel);
		filme.setPromocao(promocao);

		if (promocao.equals("Sim")) {
			filme.setValorPromocao(Double.parseDouble(valorPromocao));
		}

		filme.setDiretor(diretor);
		filme.setAnoLancamento(anoLancamento);
		filme.setFaixaEtaria(Integer.parseInt(faixaEtaria));
		filme.setGenero(genero);
	}


	private void limparCampos() {
		setNome(null);
		setValor(null);
		setDisponivel(null);
		setPromocao(null);
		setValorPromocao(null);
		setDiretor(null);
		setFaixaEtaria(null);
		setAnoLancamento(null);
		setGenero(null);
	}
	
	/*
	 * método para pesquisar filmes
	 */
	public String pesquisar() {
		
		try {
			listaFilmes = new FilmeController().buscarPorNome(nomePesquisar);
		} catch (Exception e) {
			JSFUtil.addErrorMessage("Erro ao pesquisar Filmes!");
		}
		
		return "";
		
	}
	
	public String alterar() {
		nome = filmeSelecionado.getNome();
		valor = filmeSelecionado.getValor() + "";
		disponivel = filmeSelecionado.getDisponivel();
		promocao = filmeSelecionado.getPromocao();
		valorPromocao = filmeSelecionado.getValorPromocao() + "";
		diretor = filmeSelecionado.getDiretor();
		faixaEtaria = filmeSelecionado.getFaixaEtaria() + "";
		anoLancamento = filmeSelecionado.getAnoLancamento();
		genero = filmeSelecionado.getGenero();
		
		return "";
	}
	
	public String excluir() {
		
		try {
			new FilmeController().excluir(filmeSelecionado);
			pesquisar();
			JSFUtil.addInfoMessage("Filme excluído com sucesso!");
		} catch (Exception e) {
			JSFUtil.addErrorMessage("Erro ao excluir o Filme!");
		}
		
		return "";
	}

}
