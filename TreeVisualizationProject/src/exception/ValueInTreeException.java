package exception;

public class ValueInTreeException extends Exception {
	public String getMessage() {
		return "Error: Node already in tree!";
	}
}
