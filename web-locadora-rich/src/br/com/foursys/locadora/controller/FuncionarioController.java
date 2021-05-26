package br.com.foursys.locadora.controller;

import java.util.ArrayList;

import br.com.foursys.locadora.bean.Funcionario;
import br.com.foursys.locadora.dao.FuncionarioDAO;

/**
 * Classe responsavel por acessar o objeto DAO e efetuar altera��es e consulta na base de dados
 * @author Renato Sampaio
 *
 */
public class FuncionarioController {
	public void salvar(Funcionario funcionario) {
		try {
			new FuncionarioDAO().salvar(funcionario);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void excluir(Funcionario funcionario) {
		try {
			new FuncionarioDAO().excluir(funcionario);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Funcionario> buscarPorNome(String nome){
		
        ArrayList<Funcionario> retorno = new ArrayList<Funcionario>();
        
        try {
			retorno = new FuncionarioDAO().buscarPorNome(nome);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return retorno;
	}

}
