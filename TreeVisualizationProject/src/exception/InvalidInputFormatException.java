package exception;

public class InvalidInputFormatException extends Exception {
	public String getMessage() {
		return "Error: Node value must be an integer!";
	}
}
