package br.com.foursys.locadora.controller;

import java.util.ArrayList;

import br.com.foursys.locadora.bean.Filme;
import br.com.foursys.locadora.dao.FilmeDAO;

/*
 * Classe responsavel por acessar o objeto DAO e edetuar alterações e consultas na base de dados
 */

public class FilmeController {

	public void salvar (Filme filme) {
		try {
			new FilmeDAO().salvar(filme);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void excluir (Filme filme) {
		try {
			new FilmeDAO().excluir(filme);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Filme> buscarPorNome(String nome){
        // lista auxiliar para retornar no mÃ©todo
        ArrayList<Filme> retorno = new ArrayList<Filme>();
        
        try {
        	retorno = new FilmeDAO().buscarPorNome(nome);
        }catch (Exception e) {
        	e.printStackTrace();
        }
        return retorno;
	}
}
