package br.com.foursys.locadora.controller;

import java.util.ArrayList;

import br.com.caelum.stella.type.Estado;
import br.com.foursys.locadora.dao.EstadoDAO;
import br.com.foursys.locadora.util.JSFUtil;

/**
 * Classe responsável por controlar os métodos do objeto Estado
 * 
 * @author Renato Sampaio
 * @since 08/03/2021
 * @version 1.0
 */
public class EstadoController {

    /*
     * método para retornar os estados gravados na tabela
     */

    public ArrayList<Estado> buscarTodos() {
        //lista auxiliar para retornar no método
        ArrayList<Estado> retorno = null;

        try {
            retorno = new EstadoDAO().buscarTodos();
        } catch (Exception ex) {
        	 JSFUtil.addErrorMessage("Erro ao Consultar Estados ");

        }
        
        return retorno;
    }
	
}// fim da classe
