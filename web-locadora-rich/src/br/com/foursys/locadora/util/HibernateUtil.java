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
    
    // atributo para armazenar a seção de comunicação
    private static final SessionFactory sessionFactory = buildSessionFactory();
    
    /*
    * Método responsavel para criar uma seção de conexão com o banco de dados
    */
    
    private static SessionFactory buildSessionFactory(){
        
        return new AnnotationConfiguration().configure().buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}