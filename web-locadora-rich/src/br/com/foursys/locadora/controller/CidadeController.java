package br.com.foursys.locadora.controller;

import java.util.ArrayList;

import br.com.caelum.stella.type.Estado;
import br.com.foursys.locadora.bean.Cidade;
import br.com.foursys.locadora.dao.CidadeDAO;
import br.com.foursys.locadora.util.JSFUtil;

/**
 *
 * @author Renato Sampaio
 * @since 
 */
public class CidadeController {
    
    /*
    * método para retornar os estados gravados na tabela
    */
    public ArrayList<Cidade> buscarPorEstado(Estado estado) {
        //lista auxiliar para retornar no método
        ArrayList<Cidade> retorno = null;
        
        try {
            retorno = new CidadeDAO().buscarPorEstado(estado);
        } catch (Exception ex) {
            JSFUtil.addErrorMessage("Erro ao Consultar Estados ");
        }
        
        return retorno;
    }
}
