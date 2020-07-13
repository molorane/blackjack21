/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entelect;

/**
 * @author Mothusi Molorane
 */
public class InvalidCardException extends RuntimeException{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidCardException(String message){
        super(message);
    }
}
