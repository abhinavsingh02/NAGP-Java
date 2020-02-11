package exercise.slide20;

public class OperationNotSupportedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int side;

	public OperationNotSupportedException(int side) {
		this.side = side;
	}

	public int getSide() {
		return side;
	}

}
