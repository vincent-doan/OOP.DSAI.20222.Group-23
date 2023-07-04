package exception;

public class UnbalancedTreeException extends Exception {
	public String getMessage() {
		return "Error: This tree will become unbalanced!";
	}
}
