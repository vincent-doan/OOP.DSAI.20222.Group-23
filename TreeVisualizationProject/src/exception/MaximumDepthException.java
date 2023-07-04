package exception;

public class MaximumDepthException extends Exception {
	public String getMessage() {
    	return "Error: Maximum depth must be a positive integer!";
    }
}
