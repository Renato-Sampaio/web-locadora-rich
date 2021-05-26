package br.com.foursys.locadora.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Classe responsavel por efetuar a conexao com o banco de dados
 * @author Renato Sampaio
 * @since 24/04/2021
 * @version 1.0
 */
@SuppressWarnings("deprecation")
public class HibernateUtil {
    
    // atributo para armazenar a se��o de comunica��o
    private static final SessionFactory sessionFactory = buildSessionFactory();
    
    /*
    * M�todo responsavel para criar uma se��o de conex�o com o banco de dados
    */
    
    private static SessionFactory buildSessionFactory(){
        
        return new AnnotationConfiguration().configure().buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}