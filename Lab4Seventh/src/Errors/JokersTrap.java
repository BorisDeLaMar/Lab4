package Errors;

public class JokersTrap extends Exception{
	protected String message;
	
	public JokersTrap(String message) {
		this.message = message;
	}
	public JokersTrap() {}
	
	@Override
	public String getMessage() {
		return message;
	}
}
