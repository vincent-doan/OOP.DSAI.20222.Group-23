package exception;

public class ValueNotInTreeException extends Exception {
	public String getMessage() {
		return "Error: Node not found in tree!";
	}
}
