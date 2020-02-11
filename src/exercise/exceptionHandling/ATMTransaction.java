package exercise.exceptionHandling;

public class ATMTransaction {

	void execute(String transactionType) throws UnsupportedTransactionException {

		switch (transactionType) {

		case "credit":
			System.out.println("Credited the account with $500.");
			break;
		case "debit":
			System.out.println("Debited the account with $500.");
			break;
		case "balanceInquir":
			System.out.println("Requested for balance enquiry.");
			break;
		case "pinChange":
			System.out.println("Requested for pin change.");
			break;
		default:
			throw new UnsupportedTransactionException(transactionType);

		}
	}

	public static void main(String[] args) {
		ATMTransaction obj = new ATMTransaction();
		try {
			obj.execute("cheque book");
		} catch (UnsupportedTransactionException e) {
			System.out.println("Please enter the supprted transaction type.\n" + e.getString()+" is not supported transaction type.");
			//e.printStackTrace();
		}
	}
}
