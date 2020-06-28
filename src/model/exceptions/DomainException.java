package model.exceptions;
//extends Exception obriga que a exceção seja tratada, pode ser trocada por RuntimeException que não obriga.
public class DomainException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
	
	
}
