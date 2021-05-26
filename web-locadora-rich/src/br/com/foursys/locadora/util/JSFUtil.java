/**
 * 
 */
package br.com.foursys.locadora.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 * Classe para exibir mensagens
 * @author Renato Duarte Sampaio
 *
 * @since 27 de abr. de 2021
 */
public class JSFUtil {
	
	//retornando mensagem de erro
	public static void addErrorMessage(String msg) {
		
		FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg);
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage(msg, facesMessage);
		
		
	}
	
	public static void addInfoMessage(String msg) {
		
		FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, msg);
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage(msg, facesMessage);
		
		
	}


}
