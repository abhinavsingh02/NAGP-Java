package createException;

public class Finally_ExcepTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[2];
		try {
			System.out.println("Acess element three " + a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown " + e);
		} finally {
			a[0] = 6;
			System.out.println("First element value " + a[0] + ".");
			System.out.println("The finally element is executed.");
		}

	}

}