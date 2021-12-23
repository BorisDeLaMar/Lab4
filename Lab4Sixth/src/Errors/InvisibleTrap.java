package Errors;

public class InvisibleTrap extends RuntimeException{
	protected String message;
	
	public InvisibleTrap(String message) {
		this.message = message;
	}
	@Override
	public String getMessage() {
		return message;
	}
}
