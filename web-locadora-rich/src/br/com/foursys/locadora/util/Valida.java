package br.com.foursys.locadora.util;

/**
 * Classe respons�vel por armazenar os m�todos de valida��o de dados
 *
 * @author Renato Sampaio
 * @since 17/03/2021
 * @version 1.0
 */
public class Valida {
    
    public static boolean isEmptyOrNull(String args) {
        return (args.trim().equals("") || args == null);
    }
    
    public static boolean isInteger(String args) {
        try {
            Integer.parseInt(args);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public static boolean isDouble(String args) {
        try {
            Double.parseDouble(args);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public static boolean isDoubleZero(double num) {
    	if (num == 0) {
			return true;
		}
    	return false;
    }
    
    public static boolean isIntZero(int num) {
    	if (num == 0) {
			return true;
		}
    	return false;
    }

}
