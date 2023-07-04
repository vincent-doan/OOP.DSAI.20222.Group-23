package exception;

public class NonbinaryTreeException extends Exception {
	public String getMessage() {
		return "Error: This tree will become nonbinary!";
	}
}
