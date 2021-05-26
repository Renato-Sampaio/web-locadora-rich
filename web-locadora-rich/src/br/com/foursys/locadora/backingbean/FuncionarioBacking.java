
package br.com.foursys.locadora.backingbean;

import java.util.ArrayList;

import br.com.foursys.locadora.bean.Funcionario;
import br.com.foursys.locadora.util.JSFUtil;
import br.com.foursys.locadora.util.Valida;

/**
 * Classe respons�vel por controlar os componentes do front-end Funcionario
 * 
 * @author Renato Sampaio
 * @since 27/04/2021
 * @version 1.0
 */
public class FuncionarioBacking {

	// atributos da tela de cadastro
	private String nome;
	private String cpf;
	private String rg;
	private String dataNascimento;
	private String sexo;
	private String logradouro;
	private String endereco;
	private String numero;
	private String complemento;
	private String bairro;
	private String estado;
	private String cidade;
	private String cep;
	private String telefone;
	private String celular;
	private String email;
	private String idade;
	private String login;
	private String senha;
	private String perfilAcesso;
	
	// atributos da tela de consulta
	private String nomePesquisar;
	private Funcionario funcionarioSelecionado;

	// atributos auxiliares
	private Funcionario funcionario;
	private ArrayList<Funcionario> listaFuncionarios;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNomePesquisar() {
		return nomePesquisar;
	}

	public void setNomePesquisar(String nomePesquisar) {
		this.nomePesquisar = nomePesquisar;
	}
	
	public Funcionario getFuncionarioSelecionado() {
		return funcionarioSelecionado;
	}

	public void setFuncionarioSelecionado(Funcionario funcionarioSelecionado) {
		this.funcionarioSelecionado = funcionarioSelecionado;
	}

	public ArrayList<Funcionario> getListaFuncionarios() {
		return listaFuncionarios;
	}

	public void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
		this.listaFuncionarios = listaFuncionarios;
	}
	
	
	
	/*
	 * m�todo valida
	 */
	
public String getPerfilAcesso() {
		return perfilAcesso;
	}

	public void setPerfilAcesso(String perfilAcesso) {
		this.perfilAcesso = perfilAcesso;
	}

private boolean validar() {
		
		if (Valida.isEmptyOrNull(sexo)) {
			JSFUtil.addErrorMessage("Informe o sexo, campo obrigat�rio!");
			return false;
		}

		if (Valida.isEmptyOrNull(nome)) {
			JSFUtil.addErrorMessage("Informe o nome, campo obrigat�rio!");
			return false;
		}
		
		if (Valida.isEmptyOrNull(cpf)) {
			JSFUtil.addErrorMessage("Informe o CPF, campo obrigat�rio!");
			return false;
		}
		
		if (!Valida.isInteger(rg)) {
			JSFUtil.addErrorMessage("Informe o RG, campo obrigat�rio!");
			return false;
		} else if (Valida.isIntZero(Integer.parseInt(rg))) {
			JSFUtil.addErrorMessage("Informe um RG v�lido ! (somente n�meros)");
			return false;
		}
		
		if (!Valida.isInteger(idade)) {
			JSFUtil.addErrorMessage("Informe a idade, campo obrigat�rio!");
			return false;
		} else if (Valida.isIntZero(Integer.parseInt(idade))) {
			JSFUtil.addErrorMessage("Informe uma idade v�lida ! (somente n�meros)");
			return false;
		}
		
		if (Valida.isEmptyOrNull(dataNascimento)) {
			JSFUtil.addErrorMessage("Informe a data de nascimento, campo obrigat�rio!");
			return false;
		}
		
		if (Valida.isEmptyOrNull(logradouro)) {
			JSFUtil.addErrorMessage("Informe o logradouro, campo obrigat�rio!");
			return false;
		}
		
		if (Valida.isEmptyOrNull(endereco)) {
			JSFUtil.addErrorMessage("Informe o endere�o, campo obrigat�rio!");
			return false;
		}
		
		if (Valida.isEmptyOrNull(bairro)) {
			JSFUtil.addErrorMessage("Informe o bairro, campo obrigat�rio!");
			return false;
		}
		
		if (!Valida.isInteger(cep)) {
			JSFUtil.addErrorMessage("Informe o CEP, campo obrigat�rio!");
			return false;
		} else if (Valida.isIntZero(Integer.parseInt(cep))) {
			JSFUtil.addErrorMessage("Informe um CEP v�lido ! (somente n�meros)");
			return false;
		}
		
		if (!Valida.isInteger(numero)) {
			JSFUtil.addErrorMessage("Informe o N�mero, campo obrigat�rio!");
			return false;
		} else if (Valida.isIntZero(Integer.parseInt(numero))) {
			JSFUtil.addErrorMessage("Informe um N�mero v�lido ! (somente n�meros)");
			return false;
		}
		
		if (Valida.isEmptyOrNull(email)) {
			JSFUtil.addErrorMessage("Informe o email, campo obrigat�rio!");
			return false;
		}
		
		if (!Valida.isInteger(celular)) {
			JSFUtil.addErrorMessage("Informe o celular, campo obrigat�rio!");
			return false;
		} else if (Valida.isIntZero(Integer.parseInt(celular))) {
			JSFUtil.addErrorMessage("Informe um celular v�lido ! (somente n�meros)");
			return false;
		}
		
		if (Valida.isEmptyOrNull(login)) {
			JSFUtil.addErrorMessage("Informe o login, campo obrigat�rio!");
			return false;
		}
		
		if (Valida.isEmptyOrNull(senha)) {
			JSFUtil.addErrorMessage("Informe a senha, campo obrigat�rio!");
			return false;
		}
		
		if (Valida.isEmptyOrNull(perfilAcesso)) {
			JSFUtil.addErrorMessage("Informe o perfil de acesso, campo obrigat�rio!");
			return false;
		}
		
		return true;
	}


/* M�todo para limpar campos
*/
private void limparCampos() {
		setNome(null);
		setSexo(null);
		setCpf(null);
		setRg(null);
		setIdade(null);
		setDataNascimento(null);
		setLogradouro(null);
		setEndereco(null);
		setComplemento(null);
		setBairro(null);
		setCep(null);
		setNumero(null);
		setEstado(null);
		setCidade(null);
		setEmail(null);
		setTelefone(null);
		setCelular(null);
		setLogin(null);
		setSenha(null);
		setPerfilAcesso(null);
	}
	
	/*
	 * m�todo para abrir a tela de cadastro
	 */
	public String cadastroFuncionario() {
		return "";
	}
	
}