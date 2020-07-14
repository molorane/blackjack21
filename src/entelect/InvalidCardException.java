package entelect;

/**
 * @author Mothusi Molorane
 */
public class InvalidCardException extends RuntimeException{
  
	private static final long serialVersionUID = 1L;

	public InvalidCardException(String message){
        super(message);
    }
}
