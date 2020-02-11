package createException;

public class DividebyZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=8;
		int j=0;
		
		try {
			int k=i/j;
			System.out.println("The quotient is "+k+".");
		}
		
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("The value of i cant be divide by 0");
			e.printStackTrace();
		}
		
	}
}