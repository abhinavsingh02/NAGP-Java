package createException;

public class ExcepTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[2];
		try {
			System.out.println("Access element " + a[9]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array element does not exists.");
			e.printStackTrace();
		} finally {
			a[3] = 7;
			System.out.println("The element at index 0 is:" + a[0] );
			System.out.println("The finally statement is executed.");

		}

	}

}
