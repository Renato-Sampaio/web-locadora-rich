package br.com.foursys.locadora.controller;

import java.util.ArrayList;

import br.com.caelum.stella.type.Estado;
import br.com.foursys.locadora.dao.EstadoDAO;
import br.com.foursys.locadora.util.JSFUtil;

/**
 * Classe respons�vel por controlar os m�todos do objeto Estado
 * 
 * @author Renato Sampaio
 * @since 08/03/2021
 * @version 1.0
 */
public class EstadoController {

    /*
     * m�todo para retornar os estados gravados na tabela
     */

    public ArrayList<Estado> buscarTodos() {
        //lista auxiliar para retornar no m�todo
        ArrayList<Estado> retorno = null;

        try {
            retorno = new EstadoDAO().buscarTodos();
        } catch (Exception ex) {
        	 JSFUtil.addErrorMessage("Erro ao Consultar Estados ");

        }
        
        return retorno;
    }
	
}// fim da classe
