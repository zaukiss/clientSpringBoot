package serveur.mobile.utils;

public class UserAlreadyExistException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public UserAlreadyExistException(String msg){
		
		super(msg);
	}

}