package createException;

public class VibgyorException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = { "Violet", "Indigo", "Blue", "Green", "Yellow", "Orange", "Red" };
		try {
			System.out.println(strArray[2]);
			System.out.println(strArray[8]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("No color at the given index");
			e.printStackTrace();
		} finally {
			System.out.println("The finally statement is executed.");
		}

	}

}
