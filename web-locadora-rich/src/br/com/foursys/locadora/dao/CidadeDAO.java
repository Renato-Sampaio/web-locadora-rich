package br.com.foursys.locadora.dao;


import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.stella.type.Estado;
import br.com.foursys.locadora.bean.Cidade;
import br.com.foursys.locadora.util.HibernateUtil;


/**
 *
 * @author Renato Sampaio
 * @since 
 */
public class CidadeDAO extends GenericDAO{
    
    /*
    * m�todo para consultar os cidades por estado gravados na tabela
    */
    public ArrayList<Cidade> buscarPorEstado(Estado estado) throws Exception{
        // lista auxiliar para retornar no m�todo
        ArrayList<Cidade> retorno = new ArrayList<Cidade>();
        // classe auxiliar para armazenar a sess�o com o banco de dados
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        // classe auxiliar para consultar o banco de dados
        Criteria criteria = sessao.createCriteria(Cidade.class);
        // adicionando a restri��o de consulta = WHERE
        criteria.add(Restrictions.eq("estadoIdEstado", estado));
        // adicionando a ordena��o da pesquisa
        criteria.addOrder(Order.asc("idCidade"));
        // valorizando o objeto de retorno do m�todo com os registros da tabela
        retorno = (ArrayList<Cidade>) criteria.list();
        // encerrando a conex�o com o banco de dados
        sessao.close();
        // retornando a lista preenchida
        return retorno;
    }// fim do m�todo buscarTodos
    
}// fim da classe