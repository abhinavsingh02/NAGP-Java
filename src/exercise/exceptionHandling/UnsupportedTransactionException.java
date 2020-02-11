package exercise.exceptionHandling;

public class UnsupportedTransactionException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String transactionType;
	
	public UnsupportedTransactionException(String transactionType) {
    	this.transactionType= transactionType;
    }
	 
	public String getString() {
		return transactionType;
	}
	
	

}
